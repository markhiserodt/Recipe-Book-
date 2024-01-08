package recipebook.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import recipebook.entity.Recipe
import recipebook.service.RecipeService

@RestController
class RecipeController {
    @Autowired
    lateinit var service: RecipeService

    @GetMapping("/api/recipe")
    fun get(): List<Recipe> {
        return service.get()
    }

    @PostMapping("/api/recipe")
    fun add(@RequestBody recipe: Recipe): Recipe {
        return service.add(recipe)
    }

    @PutMapping("/api/recipe")
    fun update(@RequestBody recipe: Recipe): Recipe {
        return service.update(recipe)
    }

    @DeleteMapping("/api/recipe/{id}")
    fun delete(@PathVariable id: Int) {
        return service.delete(id)
    }
}