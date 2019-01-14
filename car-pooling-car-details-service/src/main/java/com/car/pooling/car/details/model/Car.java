package com.car.pooling.car.details.model;


public class Car {	
	
	private String name;

	private short co2;

	private short enginePower;

	
	private String FIN;
	
	private String basePrice;
	
	private String location;

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

	public String getFIN() {
		return FIN;
	}

	public void setFIN(String fIN) {
		FIN = fIN;
	}

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

		@Override
	public String toString() {
		return "Car [name=" + name + ", co2=" + co2 + ", enginePower=" + enginePower + ", FIN=" + FIN + ", basePrice="
				+ basePrice + ", location=" + location + "]";
	}
	
	
}
