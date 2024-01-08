package recipebook.service

import org.ktorm.database.Database
import org.ktorm.dsl.eq
import org.ktorm.entity.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import recipebook.entity.FoodGroup
import recipebook.entity.FoodGroups

@Service
class FoodGroupService {
    @Autowired
    lateinit var database: Database

    val Database.foodGroups get() = this.sequenceOf(FoodGroups)

    fun get(): List<FoodGroup> {
        return database.foodGroups.toList()
    }

    fun add(foodGroup: FoodGroup): FoodGroup {
        database.foodGroups.add(foodGroup);
        return foodGroup
    }

    fun update(foodGroup: FoodGroup): FoodGroup {
        database.foodGroups.update(foodGroup)
        return foodGroup
    }

    fun delete(id: Int) {
        val foodGroup = database.foodGroups.find { it.id eq id } ?: return
        foodGroup.delete()
    }
}