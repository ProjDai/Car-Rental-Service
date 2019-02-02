package com.car.pooling.available.cars.controller;

import java.util.List;

import org.apache.commons.collections4.map.CaseInsensitiveMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.car.pooling.available.cars.config.ApplicationProperties;

/**
 * Die Class AvailableCarsController.
 */
@RestController
public class AvailableCarsController {

	/** Die properties. */
	@Autowired
	private ApplicationProperties properties;

	/**
	 * Test--> http://localhost:8080//car/pooling/available/cars?location=Stuttgart
	 * URL Problem gelöst :D
	 * @param location, um die Liste mit den Autos für die eingegebene location zu bekommen
	 * @return die verfügbaren Autos zu dieser location ausgeben
	 */
	@GetMapping(value = "/car/pooling/available/cars", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getAvailableCars(@RequestParam String location) {
		CaseInsensitiveMap<String, List<String>> carsMap = new CaseInsensitiveMap<>(properties.getAvailableCarsMap());
		List<String> carsList = carsMap.get(location);
		return carsList;
	}
}
