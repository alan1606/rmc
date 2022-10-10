package com.aguirre.microservicios.app.oauth.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

import com.aguirre.microservicios.app.commons.usuarios.models.entity.Usuario;
import com.aguirre.microservicios.app.oauth.services.IUsuarioService;

import feign.FeignException;

@Component
public class AuthenticationSuccessErrorHandler implements AuthenticationEventPublisher{

	private Logger log = LoggerFactory.getLogger(AuthenticationSuccessErrorHandler.class);
	
	@Autowired
	private IUsuarioService service;
	
	@Override
	public void publishAuthenticationSuccess(Authentication authentication) {
		
		//if(authentication.getName().equalsIgnoreCase("frontendapp")) {
		if(authentication.getDetails() instanceof WebAuthenticationDetails) {
			return;
		}
		
		UserDetails user = (UserDetails) authentication.getPrincipal();
		String mensaje = "Success login " + user.getUsername();
		System.out.println(mensaje);
		log.info(mensaje);
		
		Usuario usuario = service.findByUsername(authentication.getName());
		if(usuario.getIntentos() != null && usuario.getIntentos() > 0) {
			usuario.setIntentos(0);
			service.update(usuario, usuario.getId());
		}
	}

	@Override
	public void publishAuthenticationFailure(AuthenticationException exception, Authentication authentication) {
		String mensaje = "Error en el login: "+ exception.getMessage();
		log.error(mensaje);
		System.out.println(mensaje);
		
		try {
			Usuario usuario = service.findByUsername(authentication.getName());
			if(usuario.getIntentos() == null) {
				usuario.setIntentos(0);
			}
			usuario.setIntentos(usuario.getIntentos() + 1);
			if(usuario.getIntentos() >= 3) {
				log.error(String.format("El usuario %s deshabilitado por máximos intentos", usuario.getUsername()));
				usuario.setEnabled(false);
			}
			service.update(usuario, usuario.getId());
		}
		catch(FeignException e) {
			log.error(String.format("El usuario %s no existe en el sistema", authentication.getName()));
		}
		
	}

}
