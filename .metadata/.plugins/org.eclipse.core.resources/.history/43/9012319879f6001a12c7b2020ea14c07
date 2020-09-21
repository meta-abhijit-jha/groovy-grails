package com.abhijit

//Contains Business Logic
//Grails create a Spring skeleton bean for each service

import grails.gorm.transactions.Transactional

@Transactional
class StudentService {
	
	def get(id) {
		Student.get(id)
	}
	
	def list() {
		Student.list()
	}
	
	def save(student) {
		student.save()
	}
	
	def delete(id) {
		Student.get(id).delete()
	}
}
