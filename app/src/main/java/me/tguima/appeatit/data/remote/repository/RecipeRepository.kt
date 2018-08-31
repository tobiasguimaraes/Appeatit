package me.tguima.appeatit.data.remote.repository

import io.reactivex.Observable
import me.tguima.appeatit.data.remote.Api
import me.tguima.appeatit.model.Recipe
import javax.inject.Inject

open class RecipeRepository @Inject constructor(private val api: Api) {

    fun getRecipes(): Observable<List<Recipe>> {
        return api.fetchRecipes()
    }

}