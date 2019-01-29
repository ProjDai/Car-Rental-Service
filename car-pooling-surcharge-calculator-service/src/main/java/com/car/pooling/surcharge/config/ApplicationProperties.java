package com.car.pooling.surcharge.config;

import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Die Class ApplicationProperties.
 */
@Component
@ConfigurationProperties
public class ApplicationProperties {

	/**
	*  Hier sind die Surcharges für die Engine Power kleiner gleich 140 hinterlegt (lessThan140Map)
	*/
	
	private Map<String, Integer> lessThan140Map;

	
	private Map<String, Integer> lessThan200Map;

	
	private Map<String, Integer> lessThan320Map;

	
	private Map<String, Integer> lessThan400Map;

	
	private Map<String, Integer> greaterThan400Map;

	public Map<String, Integer> getLessThan140Map() {
		return lessThan140Map;
	}

	public void setLessThan140Map(Map<String, Integer> lessThan140Map) {
		this.lessThan140Map = lessThan140Map;
	}

	public Map<String, Integer> getLessThan200Map() {
		return lessThan200Map;
	}

	public void setLessThan200Map(Map<String, Integer> lessThan200Map) {
		this.lessThan200Map = lessThan200Map;
	}

	public Map<String, Integer> getLessThan320Map() {
		return lessThan320Map;
	}

	public void setLessThan320Map(Map<String, Integer> lessThan320Map) {
		this.lessThan320Map = lessThan320Map;
	}

	public Map<String, Integer> getLessThan400Map() {
		return lessThan400Map;
	}

	public void setLessThan400Map(Map<String, Integer> lessThan400Map) {
		this.lessThan400Map = lessThan400Map;
	}

	public Map<String, Integer> getGreaterThan400Map() {
		return greaterThan400Map;
	}

	public void setGreaterThan400Map(Map<String, Integer> greaterThan400Map) {
		this.greaterThan400Map = greaterThan400Map;
	}


}
