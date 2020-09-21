package com.test.demo

def employee = [
	'name': 'John',
	'age': 24
]

println employee

//println employee.name
//println employee["name"]
//println employee.get('name')
//println employee.getAt('name')
//
//println employee.size()

employee.put('city', "Jaipur")
//println employee

//println employee.containsKey("city")
//println employee.containsValue(24)

//def newEmp = employee.clone()
//println newEmp

//Closure usage in map
//Method 1
//employee.each { key, value ->  println(key+':'+value)}

//Method 2
//employee.eachWithIndex { key, value, i -> 
//	println "[${i}] ${key} ${value}"
//}

//Method 3
//employee.each { entry -> 
//	println "${entry.key} ${entry.value}"
//}

def entries = employee.entrySet()
println entries

entries.each { entry -> 
	println entry.key in ['city', 'name']
}

entries.clear()

println entries






