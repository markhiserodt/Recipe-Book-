package recipebook.entity

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object Foods : Table<Food>("Food") {
    val id = int("id").primaryKey().bindTo { it.id }
    val name = varchar("name").bindTo { it.name }
    val foodGroupId = int("food_group_id").references(FoodGroups) { it.foodGroup }
}

interface Food : Entity<Food> {
    val id: Int
    var name: String
    var foodGroup: FoodGroup
}