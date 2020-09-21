package controllerpractice

import grails.gorm.transactions.Transactional

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

}
