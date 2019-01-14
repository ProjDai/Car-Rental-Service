package com.car.pooling.car.details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.car.pooling.car.details.config.ApplicationProperties;
import com.car.pooling.car.details.model.Car;
import com.car.pooling.car.details.model.CarDetails;
import com.car.pooling.car.details.model.CarPriceDetails;

/**
 * Die Class CarDetailsController. Geschafft :DDDDD
 */
@RestController
public class CarDetailsController {

	@Autowired
	private ApplicationProperties properties;

	/**
	 * Um die details für das Auto zu bekommen
	 * Test --> http://localhost:8989/car/pooling/car/details?carName=AMG S 63 Cabrio
	 * @param carName --> Request Autoname
	 * @return die Auto details
	 */
	@GetMapping(value = "/car/pooling/car/details", produces = MediaType.APPLICATION_JSON_VALUE)
	public CarDetails getCarDetails(@RequestParam String carName) {
		Car car = properties.getCarDetailsList().stream().filter(carDetail -> carDetail.getName().equals(carName))
				.findFirst().orElse(null);
		return new CarDetails(car.getName(), car.getCo2(), car.getEnginePower(), car.getFIN());
	}

	/**
	 * Um die price details zu den Autos zu bekommen
	 * Test http://localhost:8989/car/pooling/car/price?FIN=9753198
	 * @param FIN eingeben, um das die details zu bekommen
	 * @return die price details für das Auto (von der eingegebenen FIN) */
	
	@GetMapping(value = "/car/pooling/car/price", produces = MediaType.APPLICATION_JSON_VALUE)
	public CarPriceDetails getCarPriceDetails(@RequestParam String FIN) {
		Car car = properties.getCarDetailsList().stream().filter(carDetail -> carDetail.getFIN().equals(FIN))
				.findFirst().orElse(null);
		return new CarPriceDetails(car.getBasePrice(), car.getLocation(), car.getEnginePower());
	}
}
