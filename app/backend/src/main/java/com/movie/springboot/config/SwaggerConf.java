package com.movie.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConf {
	 @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.movie.springboot"))
	                .paths(PathSelectors.regex("/api.*"))
	                .build()
	                .apiInfo(metaInfo());
	    }
	  private ApiInfo metaInfo() {

	        ApiInfo apiInfo = new ApiInfo(
	                "Movie and User API", // başlık
	                "Movies From External Api`s", // açıklama
	                "v1", // versiyon
	                "xxx", // servis url
	                new Contact("Burak GÜNDOĞDU-Eteration-2020-#Team9", "https://github.com/BurakG01", "https://github.com/eteration-bootcamp/2020-bootcamp-team-9"),
	                // iletişim bilgileri
	                "Apache License Version 2.0", // lisans
	                "https://www.apache.org/licence.html" // lisans url
	        );

	        return apiInfo;
	    }
	
}