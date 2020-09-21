package restapi

import grails.compiler.GrailsCompileStatic
import grails.rest.*

//if we put uri attribute inside @Resource it will map model to that url
//@Resource(formats=['json', 'xml']) //json first then xml

@GrailsCompileStatic
class Employee {

    //[1]Unidirectional Many-one relationship
    //Company company

    //[2]should use 'hasMany' in Company 
    //static belongsTo = [company: Company]

    //[3]Bi-directional Many-one relationship
    //Company company

    //[4]One-to-one relationship with Company
    //Company company

    //[5]Many-to-many relationship with Company
    static hasMany = [companies: Company]

    String firstName
    String lastName
    String email

    static mapping = {
        table 'Employee'
        
        firstName column: 'First_Name'
		lastName column: 'Last_Name'
		email column: 'Email'
        company column: 'Company'
    }

    static constraints = {
        firstName blank:false
        lastName blank:false
        email blank:false
        //company blank:false
    }
}
