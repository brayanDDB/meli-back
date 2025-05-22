package com.example.meli_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * class that contains the main method of the app
 */
@SpringBootApplication
public class MeliBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeliBackApplication.class, args);
	}

	/**
	 * method that creates a bean to enable the origins from localhost:3000 (where the frontend is running)
	 * @return WebMvcConfigurer with the addCorsMappings method overridden
	 */
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:3000");
			}
		};
	}

}
