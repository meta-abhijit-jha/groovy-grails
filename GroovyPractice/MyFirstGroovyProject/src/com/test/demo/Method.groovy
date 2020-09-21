package com.test.demo

class Method {
	def hello() {
		println "hello"
	}
	
	static void main(args) {
		Method instance = new Method()
		instance.hello()
	}
}