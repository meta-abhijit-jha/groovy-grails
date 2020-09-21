package com.test.demo2

class Cars {
	String name
	String color
	String model

	def startEngine() {
		println "Engine started for ${name}"
	}

	def stopEngine() {
		println "Engine stopped for ${name}"
	}

	def accelerate() {
		println "Engine accelerated for ${name}"
	}
}
