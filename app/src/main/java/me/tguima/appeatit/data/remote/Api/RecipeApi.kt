package me.tguima.appeatit.data.remote.Api

import io.reactivex.Observable
import me.tguima.appeatit.model.Recipe
import retrofit2.http.GET

interface RecipeApi {
    @GET("recipes")
    fun fetchRecipes(): Observable<List<Recipe>>
}