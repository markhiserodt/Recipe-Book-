package recipebook.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import recipebook.entity.Food
import recipebook.service.FoodService

@RestController
class FoodController {
    @Autowired
    lateinit var service: FoodService

    @GetMapping("/api/food")
    fun get(): List<Food> {
        return service.get()
    }

    @PostMapping("/api/food")
    fun add(@RequestBody food: Food): Food {
        return service.add(food)
    }

    @PutMapping("/api/food")
    fun update(@RequestBody food: Food): Food {
        return service.update(food)
    }

    @DeleteMapping("/api/food/{id}")
    fun delete(@PathVariable id: Int) {
        return service.delete(id)
    }
}