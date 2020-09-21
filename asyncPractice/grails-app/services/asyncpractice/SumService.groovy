package asyncpractice

import grails.gorm.transactions.Transactional
import grails.events.annotation.*

@Transactional
class SumService {
    //Triggering event notification

    /*take the return value of the method and publish an event using
    an event id that is the same as the method name.*/

    //We can change eventId explicitly by @Publisher('myEvent')
    @Publisher
    def sum(a, b) {
        return a + b
    }

    //Consuming events(Invoked when event occurs)
    //can also be @Subscriber('<EventID>')
    @Subscriber
    void onSum(num) {
        println "Subscriber invoked with ${num}"
    }
    
}
