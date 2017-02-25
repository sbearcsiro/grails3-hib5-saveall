package threetwosixtest

class IndexController {

    def index() {
        println System.properties['java.version']
        new Message(message: 'hello').save()
        def messages = Message.all
        messages.each { it.message += '!' }
        Message.saveAll(messages)
        render(view: '/index')

    }

    def create() {
        new Message(message: 'hello').save()
        render(view: '/index')
    }

    def change() {
        def messages = Message.all
        messages.each { it.message += '!' }
        Message.saveAll(messages)
        render(view: '/index')
    }
}
