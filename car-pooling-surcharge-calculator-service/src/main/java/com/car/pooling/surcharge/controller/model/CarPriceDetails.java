package com.car.pooling.surcharge.controller.model;


public class CarPriceDetails {
	
	
	private double basePrice;
	

	private String location;
	
	
	private short enginePower;

	
	public double getBasePrice() {
		return basePrice;
	}

	
	public void setBasePrice(double basePrice) {
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
	
}
