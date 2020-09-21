package restapi

import grails.compiler.GrailsCompileStatic
import grails.rest.*

@GrailsCompileStatic
class Company {

    //[2]One-to-many relationship with Employee
    //static hasMany = [employees: Employee]

    //[3]Bi-directional relationship with Employee
    //static belongsTo = [employee: Employee]

    //[4]one-to-one (only works with bi-directional relationships)
    //static hasOne = [employee: Employee]

    //[5]many-to-many relationship with Employee
    static belongsTo = Employee
    static hasMany = [employees: Employee]

    String companyName
    int establishedSince

    static mapping = {
        table 'Company'

        companyName column: 'Name'
        establishedSince column: 'Since'
    }
    
    static constraints = {
        companyName blank:false

        //To handle null error in case [3] and [4]
        //employee nullable: true
    }
}
