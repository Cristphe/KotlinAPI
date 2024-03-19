package projectkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProjectkotlinApiApplication

fun main(args: Array<String>) {
	runApplication<ProjectkotlinApiApplication>(*args)
}
