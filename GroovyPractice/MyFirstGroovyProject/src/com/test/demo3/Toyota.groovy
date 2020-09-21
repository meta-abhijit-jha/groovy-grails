package com.test.demo3

class Toyota extends Car{
	int topSpeed

	@Override
	public Object topSpeed() {
		println "Top Speed for ${name} is ${topSpeed}"
	}
	
	static void main(args) {
		Toyota car1 = new Toyota()
		car1.name = "Toyota"
		car1.model = 2020
		car1.topSpeed = 200
		car1.color = "Blue"
		
		car1.startEngine()
		car1.topSpeed()
	}
	
}
