package com.ydh.AuthExample.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder().group("v1-definition").pathsToMatch("/api/**").build();
	}

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("인증 API 구현 예제").description("SpringSecurity를 활용한 인증 서버 구현 예제").version("v0.0.1"));
	}
}
