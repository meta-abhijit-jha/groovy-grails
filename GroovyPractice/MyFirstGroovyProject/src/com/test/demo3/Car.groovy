package com.test.demo3

//objects can't be created of this class
//Used to keep consistency in all the child classes
//Work as a common template
abstract class Car {
	
	String name
	String color
	int model
	
	//concrete methods
	def startEngine() {
		println "Engine started for ${name}"
	}
	
	//abstract methods have no definition
	abstract def topSpeed()
}
