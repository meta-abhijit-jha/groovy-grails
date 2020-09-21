package com.test.demo

class Fruits {
	
	private String fruitName
	private String fruitColor
	
	//setters
	def setFruitName(String name) {
		fruitName = name
	}
	
	def setFruitColor(String color) {
		fruitColor = color
	}
	
	//getters
	def getFruitName() {
		return fruitName
	}
	
	def getFruitColor() {
		return fruitColor
	}
	
	//main function
	static void main(args) {
		
		Fruits apple = new Fruits()
		apple.setFruitName("Apple")
		apple.setFruitColor("Red")
		
		Fruits mango = new Fruits()
		mango.setFruitName("Mango")
		mango.setFruitColor("Yellow")
		
		println apple.properties
		println mango.properties
		
	}
}
