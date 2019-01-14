package com.car.pooling.car.details.model;

/**
 * Die Class CarPriceDetails.
 */
public class CarPriceDetails {
	
	private String basePrice;
	
	private String location;
	
	private short enginePower;

	
	public String getBasePrice() {
		return basePrice;
	}

	
	public void setBasePrice(String basePrice) {
		this.basePrice = basePrice;
	}

	
	public String getLocation() {
		return location;
	}

	
	public void setLocation(String location) {
		this.location = location;
	}

	
	public short getEnginePower() {
		return enginePower;
	}

	
	public void setEnginePower(short enginePower) {
		this.enginePower = enginePower;
	}

	/**
	 * @param basePrice 
	 * @param location 
	 * @param enginePower 
	 */
	public CarPriceDetails(String basePrice, String location, short enginePower) {
		super();
		this.basePrice = basePrice;
		this.location = location;
		this.enginePower = enginePower;
	}
	
}
