package com.groovy.practice

import java.sql.*
import groovy.sql.Sql

class DBConnectivity {

	def sqlVersion(sql) {
		sql.eachRow('SELECT VERSION()') { row ->
			println row[0]
		}
	}

	def createDB(sql) {
		def str = """CREATE TABLE EMPLOYEE ( 
         FIRST_NAME CHAR(20) NOT NULL,
         LAST_NAME CHAR(20),
         AGE INT,
         SEX CHAR(1),
         INCOME FLOAT )"""

		sql.execute str
	}

	def describeDB(sql) {
		sql.eachRow('DESC EMPLOYEE') { row ->
			println row[0]
		}
	}

	def insertIntoDB(sql) {
		sql.connection.autoCommit = false

		def str = """INSERT INTO EMPLOYEE (FIRST_NAME,
         			LAST_NAME, AGE, SEX, INCOME) 
					VALUES ('Abhi', 'Jha', 20, 'M', 2000)"""

		try {
			sql.execute str
			sql.commit()
			println "Successfully Committed"
		} catch (Exception ex) {
			sql.rollback()
			println "Rolling Back Transaction"
		}
	}

	def readTable(sql) {
		sql.eachRow('select * from EMPLOYEE') { col ->
			println([
				col.FIRST_NAME,
				col.LAST_NAME,
				col.AGE,
				col.SEX,
				col.INCOME
			])
		}
	}

	def updateTable(sql) {
		sql.connection.autoCommit = false
		def str = """UPDATE EMPLOYEE SET AGE = AGE + 1
					WHERE SEX = 'M'"""

		try {
			sql.execute(str)
			sql.commit()
		} catch (Exception e) {
			e.printStackTrace()
			sql.rollback()
		}
	}
	
	def deleteData(sql) {
		sql.connection.autoCommit = false
		def str = "DELETE FROM EMPLOYEE WHERE AGE > 22"
		
		try {
			sql.execute(str)
			sql.commit()
		} catch (Exception e) {
			e.printStackTrace()
			sql.rollback()
		}
	}

	static void main(args) {

		DBConnectivity obj = new DBConnectivity()

		//Creating Connection with DB
		def sql = Sql.newInstance('jdbc:mysql://localhost:3306/testdb?useSSL=false', 'root', '123456', 'com.mysql.jdbc.Driver')

		//1. Show version of MySQL
		//obj.sqlVersion(sql)

		//2. Create Table
		//obj.createDB(sql)

		//3. Describe Table
		//obj.describeDB(sql)

		//4. Insert into the table
		//obj.insertIntoDB(sql)

		//5. Read table data
		println 'Before:'
		obj.readTable(sql)

		//6. Update table data
		//obj.updateTable(sql)
		
		//7. Delete table data
		//obj.deleteData(sql)
		
		println 'After:'
		obj.readTable(sql)

		//Closing Connection
		sql.close()

	}
}
