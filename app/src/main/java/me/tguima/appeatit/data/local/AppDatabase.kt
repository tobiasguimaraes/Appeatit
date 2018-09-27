package me.tguima.appeatit.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import me.tguima.appeatit.BuildConfig
import me.tguima.appeatit.data.local.dao.RecipeDAO
import me.tguima.appeatit.model.Recipe

@Database(entities = [Recipe::class], version = BuildConfig.DB_VERSION)
abstract  class AppDatabase : RoomDatabase() {

    abstract fun recipeDao() : RecipeDAO

}