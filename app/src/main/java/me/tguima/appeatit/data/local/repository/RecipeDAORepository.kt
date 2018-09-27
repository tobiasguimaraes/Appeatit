package me.tguima.appeatit.data.local.repository

import android.arch.lifecycle.LiveData
import io.reactivex.Single
import me.tguima.appeatit.data.local.dao.BaseDAO
import me.tguima.appeatit.data.local.dao.RecipeDAO
import me.tguima.appeatit.model.Recipe
import javax.inject.Inject

class RecipeDAORepository @Inject constructor(private val dao : RecipeDAO) : BaseDAORepository<Recipe>(dao)   {

    fun getAllRecipes() : Single<List<Recipe>> {
        return dao.getAllRecipes()
    }

    fun getAllRecipesLive() : LiveData<List<Recipe>> {
        return dao.getAllRecipesLive()
    }

}