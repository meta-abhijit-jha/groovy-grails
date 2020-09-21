package asyncpractice

import static java.util.concurrent.TimeUnit.*

//Importing both of these are important
import static grails.async.Promises.*
import grails.async.*

class AsyncController {

    def sumService

    def index() { 
        //task is used to create promises
        def p1 = task { 2 * 2 }
        def p2 = task { 3 * 2 }
        def p3 = task { 2 * 4 }

        //Synchronous blocking of current thread:
        //waitAll waits for tasks to be completed and then returns result
        //here, the result will be [4, 6, 8]
        render waitAll(p1, p2, p3)
    }

    def onCompleteExample() {
        def p1 = task { 2 * 2 }
        def p2 = task { 3 * 2 }
        def p3 = task { 2 * 4 }

        List processes = [p1, p2, p3]

        //Won't block current thread
        def re = onComplete(processes) {
            List results -> return results
        }

        onError(processes) {
            Throwable t -> pritln "Error message: ${t.message}"
        }

        println re.get()

        render "hello"
    }

    def longRunningPromise() {
        Promise p = task {
            1888 * 1888
        }

        p.onError {
            Throwable error -> println error.message
        }

        p.onComplete {
            println "hello"+it
        }

        //will block execution until promise is resolved
        //def result = p.get()

        //will block for the given time
        def result2 = p.get(1, MINUTES)
        println result2

        render result2
    }

    def thenExample() {
        Promise promise = task {
            return 8
        }

        promise.then {
            println it
            return ( it * 2 )
        } then {
            println it
            return ( it * 2 )
        } then {
            println it
        }

        render ""
    }

    def listExample() {
        //Note: task for single task and tasks for list of tasks

        //predefined way to initialize tasks
        def promiseList = tasks([
            { 2 * 2 },
            { 4 * 4 },
            { 8 * 8 }
        ])

        //manual way
        def list = new PromiseList()
        list << { 2 * 2 }
        list << { 4 * 4 }
        list << { 8 * 8 }

        list.onComplete {
            List results -> return results
        }

        render promiseList.get() + list.get()
    }

    def mapExample() {
        //predefined way
        def promiseList = tasks(
            one: { 2 * 2 },
            two: { 4 * 4 },
            three: { 8 * 8 }
        )

        render promiseList.get()
    }

    //invoked on invokeEvent?first=5&second=7
    def invokeEvent(int first, int second) {
        render sumService.sum(first, second)
    }
}
