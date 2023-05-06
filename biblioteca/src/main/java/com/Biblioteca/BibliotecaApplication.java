package com.Biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
@EntityScan({"com.Biblioteca"})

public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}
	/**
	 * @return Docket
	 * @author Victor Andres Swagger Doc
	 */

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.Biblioteca"))
				.paths(PathSelectors.any())
				.build().apiInfo(getApiInfo());
	}

	/**
	 * @return ApiInf
	 * @author Victor Andres Aplication Info
	 */

	private ApiInfo getApiInfo() {
		return new ApiInfo("Usuarios API", "API que gestiona los usuarios de la biblioteca ", "1.0.0", "Rest",
				new Contact("GitHub", "https://github.com/VictorAndres123?tab=repositories", "vrojas-2022a@corhuila.edu.co"), "2023 - CorHuila",
				"https://opensource.org/licenses/", Collections.emptyList());
	}
}

