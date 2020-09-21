package com.test.demo

File myFile = new File("writeFileExample.txt")

myFile.write("Hello Writable")
myFile<<"\nWriting Line 2"  //Appends data
//myFile.text = "Line 3"   //Doesn't append

//Doesn't append
//myFile.withWriter { writer ->
//	writer.writeLine("Line 3 added")
//}

//appends data
myFile.append("\nLine 3 added")

//Renaming file
myFile.renameTo 'hello.txt'

//Printing content of renamed file
def newFile = new File('hello.txt')
println newFile.text