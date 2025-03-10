package at.aau.serg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication//(scanBasePackages = ["at.aau.serg"]) //ensuring that it SpringBoot scans the correct package
class SpringApp

fun main(args: Array<String>) {
    runApplication<SpringApp>(*args)
}
