package com.vcs.swaggerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
 class SwaggerdemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SwaggerdemoApplication.class, args);
	}

}
