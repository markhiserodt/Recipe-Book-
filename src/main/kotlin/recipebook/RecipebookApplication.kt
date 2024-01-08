package recipebook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RecipebookApplication

fun main(args: Array<String>) {
	runApplication<RecipebookApplication>(*args)
}
