package restapi

//import grails.gorm.transactions.*
import static org.springframework.http.HttpStatus.*
import static org.springframework.http.HttpMethod.*
import groovy.transform.CompileStatic
import grails.rest.*
import grails.converters.*

@CompileStatic
class EmployeeController extends RestfulController {

    static responseFormats = ['json', 'xml']

    EmployeeController() {
        super(Employee)
    }

    def delete() {
        render status: METHOD_NOT_ALLOWED
    }

    EmployeeService employeeService
}






//@Transactional(readOnly = true)
// class EmployeeController {

    // @Transactional
    // def update(Employee employee) {
    //     if(employee == null) {
    //         render status: NOT_FOUND
    //     } else {
    //         if(employee.hasErrors()) {
    //             respond employee.errors, view: 'edit'
    //         } else {
    //             employee.save flush:true
    //             withFormat {
    //                 html {
    //                     flash.message = message(code: 'default.updated.message', args: [message(code: 'employee.firstname', default: 'Employee'), employee.id])
    //                     redirect employee
    //                 }
    //                 '*' { render status: OK}
    //             }
    //         }
    //     }
    // }

    // @Transactional
    // def delete(Employee employee) {
    //     if(employee == null) {
    //         render status: NOT_FOUND
    //     } else {
    //         if(employee.hasErrors()) {
    //             respond employee.errors, view: 'edit'
    //         } else {
    //             employee.delete flush:true
    //             withFormat {
    //                 html {
    //                     flash.message = message(code: 'default.deleted.message', args: [message(code: 'Employee.firstname', default: 'Employee'), employee.id])
    //                     redirect action: "index", method: "GET"
    //                 }
    //                 '*' { render status: OK}
    //             }
    //         }
    //     }
    // }
//}
