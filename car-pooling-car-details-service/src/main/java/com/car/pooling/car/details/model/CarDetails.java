package com.car.pooling.car.details.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Die Class CarDetails.
 */
public class CarDetails {

	private String name;

	private short co2;

	private short enginePower;

	@JsonProperty("FIN")
	private String fin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public short getCo2() {
		return co2;
	}

	public void setCo2(short co2) {
		this.co2 = co2;
	}

	
	public short getEnginePower() {
		return enginePower;
	}


	public void setEnginePower(short enginePower) {
		this.enginePower = enginePower;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	/**
	 * @param name        der name
	 * @param co2         der co 2 Wert
	 * @param enginePower die engine power
	 * @param fin         die fin
	 */
	public CarDetails(String name, short co2, short enginePower, String fin) {
		super();
		this.name = name;
		this.co2 = co2;
		this.enginePower = enginePower;
		this.fin = fin;
	}

}
