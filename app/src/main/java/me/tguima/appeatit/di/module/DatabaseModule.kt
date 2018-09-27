package me.tguima.appeatit.di.module

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import me.tguima.appeatit.BuildConfig
import me.tguima.appeatit.data.local.AppDatabase
import me.tguima.appeatit.data.local.dao.RecipeDAO
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesAppDatabase(context : Context) : AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, BuildConfig.DB_NAME)
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build()
    }

    @Singleton
    @Provides
    fun provideRecipeDAO(appDatabase: AppDatabase) : RecipeDAO {
        return appDatabase.recipeDao()
    }

}