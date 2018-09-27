package me.tguima.appeatit.data.local.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import io.reactivex.Single
import me.tguima.appeatit.model.Recipe

@Dao
interface RecipeDAO : BaseDAO<Recipe> {

    @Query("SELECT * FROM recipe")
    fun getAllRecipes() : Single<List<Recipe>>

    @Query("SELECT * FROM recipe")
    fun getAllRecipesLive() : LiveData<List<Recipe>>


}