package com.example.swaggerpath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class SwaggerPathApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerPathApplication.class, args);
	}

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.example.swaggerpath.controllers"))
                    .build()
                .apiInfo(createCustomApiInfo());
    }

    private ApiInfo createCustomApiInfo() {
        return new ApiInfoBuilder()
                .title("My App")
                .description("My App REST API")
                .build();
    }

}
