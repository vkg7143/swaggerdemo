package com.vcs.swaggerdemo.controller;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
@Configuration
@EnableSwagger2
public class SwaggerConfig 
{
    @Bean
public Docket produceApi() {
	return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.vcs.swaggerdemo"))
			
			.build()
			.apiInfo(apiInfo());
			}
private ApiInfo apiInfo()
{
return	new ApiInfo(
		      "API documentation for contact",
		      "by VCS",
		      "1.0",
		      "",
		      new springfox.documentation.service.Contact("vivek", "www.vcs.com", "vkg7143@gmail.com"),
		      "Apache 2.0",
		      "www.vcs.com",
		      Collections.emptyList());

			
			
}
			
}
  

