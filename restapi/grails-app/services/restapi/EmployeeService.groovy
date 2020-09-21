package restapi

import grails.gorm.transactions.Transactional

@Transactional
class EmployeeService {

	// def delete(id) {
	// 	Employee.get(id).delete()
	// }
	
	// def update(id) {
	// 	def obj = Employee.get(id)
	// 	obj.firstname = "BobUpdated"
	// 	obj.save(flush:true)
	// }
}
