package com.helloworld

import grails.gorm.transactions.Transactional

@Transactional
class EmployeeService {
	
	def get(id) {
		return Employee.get(id)
	}

	def list() {
		return Employee.list()
	}

	def save(employee) {
		employee.save()
	}

	def delete(id) {
		Employee.get(id).delete()
	}
	
	def update(id) {
		Employee.get(id).update()
	}
}