package com.giffgaff.userapp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.giffgaff.userapp")
@EntityScan("com.giffgaff.userapp.model")
@EnableJpaRepositories("com.giffgaff.userapp.dao")
public class GiffGaffUserApp {

	public static void main(String[] args) {
		SpringApplication.run(GiffGaffUserApp.class, args);
		System.out.println("Application started successfully");
	}

}
