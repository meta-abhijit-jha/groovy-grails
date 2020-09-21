package com.test.demo

//Ranges: List of Sequential Values
def range = -1..10

//Will print 1..10 not the iteration
//println range

//Will print 1 to 10
//for(i in range) {
//	println i
//}

//Iterating over range closure way
//range.each {
//	i -> println i
//}

//println range.size()
//println range.getFrom()
//println range.getTo()

println range.get(4)
println range[4]

println range.contains(77)

//Returns true if range is greater to smaller
println range.isReverse()

def range2 = range.subList(2, 7)
println range2



