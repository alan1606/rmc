package com.aguirre.microservicios.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviciosConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosConfigServerApplication.class, args);
	}

}
