package recipebook.service

import org.ktorm.database.Database
import org.ktorm.dsl.eq
import org.ktorm.entity.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import recipebook.entity.Food
import recipebook.entity.Foods

@Service
class FoodService {
    @Autowired
    lateinit var database: Database

    val Database.foods get() = this.sequenceOf(Foods)

    fun get(): List<Food> {
        return database.foods.toList()
    }

    fun add(food: Food): Food {
        database.foods.add(food);
        return food
    }

    fun update(food: Food): Food {
        database.foods.update(food)
        return food
    }

    fun delete(id: Int) {
        val food = database.foods.find { it.id eq id } ?: return
        food.delete()
    }
}