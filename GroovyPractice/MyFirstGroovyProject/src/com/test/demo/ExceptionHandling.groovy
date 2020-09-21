package com.test.demo

try {
	int i = 1/0
} catch(ArithmeticException ex) {
	println ex
	println ex.getCause()
	println ex.getMessage()
} finally {
	//It will be executed everytime with/without exception
	//Can be written without catch
	println "I am inside finally"
}