package com.car.pooling.available.cars.config;

import java.util.HashMap;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Die Class ApplicationProperties*/
@Component
@ConfigurationProperties
public class ApplicationProperties {

	/** Die locations. */
	private HashMap<String, List<String>> availableCarsMap;

	/**
	 * Gets the available cars map.
	 *
	 * @return the available cars map
	 */
	public HashMap<String, List<String>> getAvailableCarsMap() {
		return availableCarsMap;
	}

	/**
	 * Sets the available cars map.
	 *
	 * @param availableCarsMap --> die verfügbaren Auto map*/
	
	public void setAvailableCarsMap(HashMap<String, List<String>> availableCarsMap) {
		this.availableCarsMap = availableCarsMap;
	}

}
