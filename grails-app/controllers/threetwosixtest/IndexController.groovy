package threetwosixtest

class IndexController {

    def index() {
        def messages = Message.all
        messages.forEach { it.message += '!'; log.error("index: ${it.message}") }
        Message.saveAll(messages)
        new Message(message: 'hello').save()
        render(view: '/index')
    }
}
