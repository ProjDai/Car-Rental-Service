package com.car.pooling.surcharge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class CarPoolingSurchargeCalculatorServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CarPoolingSurchargeCalculatorServiceApplication.class, args);
	}
	
	/**
	 * Hier kommt das Rest template hinzu.
	 *
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}

