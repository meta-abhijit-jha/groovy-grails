package com.test.demo

//Reading file

String filePath = "/home/abhijit/Documents/GroovyPractice/MyFirstGroovyProject/src/com/test/demo/fakeData.txt"
File myFile = new File(filePath)

//Reading content as String
//println myFile.text

//Collect lines into list
//def list = myFile.collect { it }
//or
//def list = myFile.readLines()
//println list

//store file content in an array
//def array = myFile as String[]
//println array

//reading file line by line
//myFile.eachLine {  item, itemNo ->
//	println item + " Line number:" + itemNo
//}

//read using inbuilt reader
//def line
//myFile.withReader { reader ->
//	while((line = reader.readLine()) != "Line C") {
//		println line
//	}
//}

//reading with new reader
//newReader() opens an IO stream and then we can perform operations on it
//But after its usage we should close the IO stream
def reader = myFile.newReader()

//while((content = reader.readLine())) {
//	println content
//}

//To copy content to other file one by one
//new File("fakeOutput.txt").append(reader)
reader.close()

println myFile.isFile()

//Get list of all files from directory
//new File ("/home/abhijit/Videos/TutorialGroovy").eachFile { 
//	file -> println file
//}

//Get files recursively
//new File ("/home/abhijit/Videos/TutorialGroovy").eachFileRecurse {
//	file -> println file
//}

//Copying data between files
def newFile = new File("outputFile.txt")
newFile << myFile.text

//delete file
newFile.delete()


