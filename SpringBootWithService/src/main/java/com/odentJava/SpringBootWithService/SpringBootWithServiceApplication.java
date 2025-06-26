package com.odentJava.SpringBootWithService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.odentJava.SpringBootWithService"
})

@EntityScan("com.odentJava.SpringBootWithService.model")
@EnableJpaRepositories("com.odentJava.SpringBootWithService.repository")
public class SpringBootWithServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithServiceApplication.class, args);
	}

}
