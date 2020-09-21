package restapi

import static org.springframework.http.HttpStatus.*
import static org.springframework.http.HttpMethod.*
import groovy.transform.CompileStatic
import grails.rest.*
import grails.converters.*

@CompileStatic
class CompanyController extends RestfulController {

    static responseFormats = ['json', 'xml']

    CompanyController() {
        super(Company)
    }

    CompanyService companyService
}
