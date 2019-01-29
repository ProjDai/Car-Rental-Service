package com.car.pooling.surcharge.controller.model;

public class PriceDetails {
	
	
	private double basePrice;
	

	private double surchargePrice;
	

	private double totalPrice;


	public double getBasePrice() {
		return basePrice;
	}


	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	
	public double getSurchargePrice() {
		return surchargePrice;
	}

	
	public void setSurchargePrice(double surchargePrice) {
		this.surchargePrice = surchargePrice;
	}


	public double getTotalPrice() {
		return totalPrice;
	}

	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public PriceDetails(double basePrice, double surchargePrice, double totalPrice) {
		super();
		this.basePrice = basePrice;
		this.surchargePrice = surchargePrice;
		this.totalPrice = totalPrice;
	}
	
	
	
	
}
