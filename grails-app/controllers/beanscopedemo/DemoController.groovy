package beanscopedemo

class DemoController {

    SomeService someServiceProxy

    def index() {
        int serviceId = someServiceProxy.retrieveServiceIdentity()

        render "Service Id: ${serviceId}"
    }
}
