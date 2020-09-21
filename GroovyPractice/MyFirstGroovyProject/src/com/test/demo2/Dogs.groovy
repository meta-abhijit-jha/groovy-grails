package com.test.demo2

class Dogs extends Animal{
	String dogName
	
	def plays() {
		println dogName + "plays"
	}
	
	def moves() {
		println dogName + "moves"
	}
}
