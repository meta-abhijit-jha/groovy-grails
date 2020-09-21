package com.test.demo

def name = ["Abhi", "Jeet", "Jha"]

println name[1]
println name.get(1)

//Heterogeneous List
def het = [1, 2, 3, ['A', 'B', 'C'], "Abhijit", 6]

println het[3][1]
println het.get(3).get(1)

println het[1..4]

println het.contains("B")
println het.get(3).contains("B")

het.add(44)
println het

het.add(2, "Abhi")
println het

//remove by index
het.remove(0)
println het

het += [30, 40, 40, "Abhi"]
println het

//remove all that matches
het -= 40
println het

//remove index 0 item
het.pop()
println het

//remove last item
het.removeLast()
println het

//return only matched elements
println het.intersect([44, 6, 8])

println het.reverse()

println het.sort()

