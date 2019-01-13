package com.car.pooling.car.details.config;

import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.car.pooling.car.details.model.Car;

/**
 * Die Class ApplicationProperties.
 */
@Component
@ConfigurationProperties
public class ApplicationProperties {

	private List<Car> carDetailsList;

	
	public List<Car> getCarDetailsList() {
		return carDetailsList;
	}

	public void setCarDetailsList(List<Car> carDetailsList) {
		this.carDetailsList = carDetailsList;
	}

	
}
