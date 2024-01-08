package recipebook.service

import org.ktorm.database.Database
import org.ktorm.dsl.eq
import org.ktorm.entity.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import recipebook.entity.Recipe
import recipebook.entity.Recipes

@Service
class RecipeService {
    @Autowired
    lateinit var database: Database

    val Database.recipes get() = this.sequenceOf(Recipes)

    fun get(): List<Recipe> {
        return database.recipes.toList()
    }

    fun add(recipe: Recipe): Recipe {
        database.recipes.add(recipe);
        return recipe
    }

    fun update(recipe: Recipe): Recipe {
        database.recipes.update(recipe)
        return recipe
    }

    fun delete(id: Int) {
        val recipe = database.recipes.find { it.id eq id } ?: return
        recipe.delete()
    }
}