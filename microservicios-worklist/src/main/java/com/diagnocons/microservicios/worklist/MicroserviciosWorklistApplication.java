package com.diagnocons.microservicios.worklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviciosWorklistApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosWorklistApplication.class, args);
	}

}
