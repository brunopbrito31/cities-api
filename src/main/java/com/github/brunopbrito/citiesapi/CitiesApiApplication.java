package com.github.brunopbrito.citiesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Por hora, não irei utilizar a camada de serviços, pois nesse primeiro momento não tenho interesse em aplicar regras de negócio

@SpringBootApplication
public class CitiesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiesApiApplication.class, args);
	}

}
