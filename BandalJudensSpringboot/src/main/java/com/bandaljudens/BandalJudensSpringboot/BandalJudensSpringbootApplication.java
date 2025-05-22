package com.bandaljudens.BandalJudensSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com/bandaljudens/BandalJudensSpringboot/controller"
})
public class BandalJudensSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BandalJudensSpringbootApplication.class, args);
	}

}
