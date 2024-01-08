package recipebook.entity

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.int

object RecipeFoods : Table<RecipeFood>("Recipe_Food") {
    val recipeId = int("recipe_id").bindTo { it.recipeId }
    val foodId = int("food_id").references(Foods) { it.food }
}

interface RecipeFood : Entity<RecipeFood> {
    val recipeId: Int
    val food: Food
}