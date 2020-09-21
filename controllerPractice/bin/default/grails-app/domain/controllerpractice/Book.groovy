package controllerpractice

class Book {

    String author
	String publication
	int printedYear

    static constraints = {
    }

    /*
        No mapping is provided thus it will auto generate the
        table name and columns according to Grails standards
    */
}
