package com.test.demo2

class Car {
	
	String name
	String color
	String brand
	int model

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		brand = brand;
	}



	public int getModel() {
		return model;
	}



	public void setModel(int model) {
		this.model = model;
	}



	static void main(args) {
		Car indica = new Car()
		Car swift = new Car()
		Car innova = new Car()
		
		indica.name = 'Indica'
		indica.color = 'Red'
		indica.brand = 'Tata'
		indica.model = 1
		
		swift.name = 'Swift'
		swift.color = 'Blue'
		swift.brand = 'Maruti'
		swift.model = 2
		
		innova.name = 'Innova'
		innova.color = 'Black'
		innova.brand = 'Toyota'
		innova.model = 3
	}
}
