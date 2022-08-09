import java.time.LocalDateTime

def call(String name) {

    "Hello ${name}, today is ${LocalDateTime.now()}"
}
