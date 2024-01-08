package recipebook.entity

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object FoodGroups : Table<FoodGroup>("Food_Group") {
    val id = int("id").primaryKey().bindTo { it.id }
    val name = varchar("name").bindTo { it.name }
}

interface FoodGroup : Entity<FoodGroup> {
    val id: Int
    var name: String
}