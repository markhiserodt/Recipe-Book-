package recipebook.entity

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object Recipes : Table<Recipe>("Recipe") {
    val id = int("id").primaryKey().bindTo { it.id }
    var name = varchar("name").bindTo { it.name }
    val foods = listOf<Food>()
}

interface Recipe : Entity<Recipe> {
    val id: Int
    var name: String
    var foods: List<Food>
}