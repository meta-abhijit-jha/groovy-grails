package com.test.demo2

class DogObjects {

	static void main(args) {
		Dogs dog1 = new Dogs()
		
		dog1.name = "Dog"
		dog1.breed = "Pug"
		dog1.dogName = "Rocky"
		
		dog1.eats() //from child class
		dog1.moves() //(overriden) from parent class
		dog1.plays() //from child class
		
		println dog1.properties
	}
}
