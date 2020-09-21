package controllerpractice

import grails.gorm.transactions.Transactional
import static grails.async.Promises.*

@Transactional
class BookService {

    def get(id) {
        return Book.get(id)
    }

    def list() {
        return Book.list()
    }

    def save(book) {
        book.save()
    }

    def delete(id) {
        Book.get(id).delete()
    }

    def update(id) {
        Book.get(id).update()
    }

    def asyncRetrieve() {
        def p1 = Book.async.get(1)
        def p2 = Book.async.get(2)
        def p3 = Book.async.get(3)
        def results = waitAll(p1, p2, p3)

        return results
    }

    def multipleAsync() {
        def promise = Book.async.task {
            withTransaction {
                def book = Book.get(1)
                book.publication = "DEF"
                book.save(flush: true)
            }
        }

        return promise.get()
    }

}
