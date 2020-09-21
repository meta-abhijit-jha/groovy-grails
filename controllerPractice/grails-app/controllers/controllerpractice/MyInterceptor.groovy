package controllerpractice


class MyInterceptor {

    //default value of order is 0
    int order = HIGHEST_PRECEDENCE

    //To customize interceptor to match all and/or exclude some controller(s)
    // MyInterceptor() {
    //     matchAll()
    //     .excludes(controller: 'login')
    // }

    MyInterceptor() {
        match(controller: 'book', action: '') //Handles default page
        match(controller: 'book', action: 'index') //handles Index page
    }

    boolean before() {

        if(Book.get(1)) {
            true
        } else {
            false
        }
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
