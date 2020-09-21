package controllerpractice

import org.springframework.context.MessageSource
import org.springframework.context.i18n.LocaleContextHolder
import static grails.async.Promises.*
import grails.async.*

class BookController {

    //To set scope of controller
    //static scope = "singleton"

    //To set default action explicitly
    //static defaultAction = "list"

    //def bookService

    //if we have only one action in the controller that will be the default
    //otherwise index will always be default
    def index() {
        //flash is a Map which gets autocleared after request object completion
        flash.message = [
            'name': 'Abhijit',
            'id': 1332
        ]

        redirect(action: 'list')
    }

    def list() {
        render flash
    }

    def getMessage() {
        render flash
    }

    //Async service injection
    AsyncBookService AsyncBookService

    def findBooks() {
        asyncBookService.list()
            .onComplete {
                results ->
                println results
            }

        render "abhi"
    }

    def asyncGORMExample() {
        asyncBookService.asyncRetrieve()
            .onComplete {
                result ->
                println result.get(1).publication
            }

        render "Abhijit"
    }

    def multipleAsync() {
        def promise = asyncBookService.multipleAsync()
        
        promise.onComplete {
            result ->
            println result.publication
        }
        
        promise.onError {
            error ->
            println "Error"
        }

        render "Multiple Async"
    }
}
