package recipebook.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import recipebook.entity.FoodGroup
import recipebook.service.FoodGroupService

@RestController
class FoodGroupController {
    @Autowired
    lateinit var service: FoodGroupService

    @GetMapping("/api/foodGroup")
    fun get(): List<FoodGroup> {
        return service.get()
    }

    @PostMapping("/api/foodGroup")
    fun add(@RequestBody foodGroup: FoodGroup): FoodGroup {
        return service.add(foodGroup)
    }

    @PutMapping("/api/foodGroup")
    fun update(@RequestBody foodGroup: FoodGroup): FoodGroup {
        return service.update(foodGroup)
    }

    @DeleteMapping("/api/foodGroup/{id}")
    fun delete(@PathVariable id: Int) {
        return service.delete(id)
    }
}