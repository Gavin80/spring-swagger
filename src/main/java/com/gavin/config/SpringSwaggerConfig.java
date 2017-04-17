package com.gavin.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringSwaggerConfig {
	@Bean
	public Docket addUserDocket(){
		Docket  docket = new Docket(DocumentationType.SWAGGER_2);
		ApiInfo apiInfo = new ApiInfo("restful api", "api 管理", "v1.0", "",
				"dasong@126.com", "", "");
		docket.apiInfo(apiInfo);
		return docket;
	}
}
