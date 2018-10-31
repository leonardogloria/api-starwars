package br.com.eluminum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.eluminum")
public class ApiStarwarsApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiStarwarsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiStarwarsApplication.class, args);
	}
}
