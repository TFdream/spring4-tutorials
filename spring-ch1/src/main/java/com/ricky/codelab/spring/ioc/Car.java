package com.ricky.codelab.spring.ioc;

public class Car {
	private String brand;
	private String manufacturer;
	private String model;
	private float price; //unit:w
	private float max_speed;
	
	public Car(String brand, String manufacturer, String model, float price,
			float max_speed) {
		this.brand = brand;
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.max_speed = max_speed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", manufacturer=" + manufacturer
				+ ", model=" + model + ", price=" + price + ", max_speed="
				+ max_speed + "]";
	}
	
}
