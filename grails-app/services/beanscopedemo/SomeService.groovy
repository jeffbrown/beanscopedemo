package beanscopedemo

class SomeService {

    static scope = 'session'

    int retrieveServiceIdentity() {
        System.identityHashCode this
    }
}
