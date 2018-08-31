package me.tguima.appeatit.data.remote

import io.reactivex.Observable
import me.tguima.appeatit.model.Recipe
import retrofit2.http.GET

interface Api {
    @GET("recipes")
    fun fetchRecipes(): Observable<List<Recipe>>
}