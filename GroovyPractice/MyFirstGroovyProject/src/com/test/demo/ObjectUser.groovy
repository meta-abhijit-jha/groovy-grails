package com.test.demo

//Java vs Groovy

//Example 1
int method(String arg) {
	return 1;
}
int method(Object arg) {
	return 2;
}
//Example of Groovy dynamic typing
//Groovy will run 1st function and Java will run second one
Object o = "Object";
int result = method(o);
println result

//Example 2
int[] array = [1, 2, 3]  // {1, 2, 3} for java
println array

//Example 3
int i
m(i)

//Java calls this
void m(long l) {
  println "in m(long)"
}

//Groovy calls this
void m(Integer i) {
  println "in m(Integer)"
}



