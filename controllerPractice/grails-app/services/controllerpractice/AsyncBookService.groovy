package controllerpractice

import grails.async.*

class AsyncBookService {
    //Making BookService Async
    //Wrapping it under promises
    @DelegateAsync BookService bookService
}
