package com.aaguirre.ris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RisApplication.class, args);
	}

}
