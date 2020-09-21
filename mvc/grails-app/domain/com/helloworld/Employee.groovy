package com.helloworld

//Model Class
class Employee {
	String firstname
	String lastname
	String email
	
	//for the order of mapping in db table
	static constraints = {
		firstname()
		lastname()
		email()
	}
	
	//map table with the model
	static mapping = {
		table 'Employee'
		
		firstname column: 'firstname'
		lastname column: 'lastname'
		email column: 'email'
	}
	
}

