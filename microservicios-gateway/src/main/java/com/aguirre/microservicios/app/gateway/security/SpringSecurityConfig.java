package com.aguirre.microservicios.app.gateway.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SpringSecurityConfig {

	@Autowired
	private JwtAuthenticationFilter authenticationFilter;
	
	@Bean
	public SecurityWebFilterChain configure(ServerHttpSecurity http) {
		return http.authorizeExchange()
				.pathMatchers("/api/security/oauth/**").permitAll()
				.pathMatchers(HttpMethod.GET, "/api/contabilidad/cfdis/**", 
						"/api/contabilidad/formas-pago/**",
						"/api/area-medica/estudios/**",
						"/api/area-medica/dictamenes/**",
						"/api/catalogo/consentimientos/**",
						"/api/catalogo/instrucciones/**",
						"/api/catalogo/items/**",
						"/api/catalogo/departamentos/**",
						"/api/recepcion/agendas/**",
						"/api/recepcion/agendas-salas/**",
						"/api/recepcion/citas/**",
						"/api/pacientes/personas/**",
						"/api/pacientes/estados/**").permitAll()
				.pathMatchers("/api/area-medica/**", "/api/catalogo/**", "/api/contabilidad/**", "/api/pacientes/**", "/api/recepcion/**", "/api/usuarios/**" ).hasRole("ADMIN")
				.anyExchange().authenticated()
				.and().addFilterAfter(authenticationFilter, SecurityWebFiltersOrder.AUTHENTICATION)
				.csrf().disable()
				.build();
	}
	
}
