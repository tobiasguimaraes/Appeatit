package me.tguima.appeatit.di.module

import dagger.Module
import dagger.Provides
import me.tguima.appeatit.data.local.AppDatabase
import me.tguima.appeatit.data.local.dao.RecipeDAO
import me.tguima.appeatit.data.local.repository.RecipeDAORepository
import javax.inject.Singleton

@Module
class RepositoryDAOModule {

    @Provides
    @Singleton
    fun provideRecipeDAORepository(recipeDAO : RecipeDAO): RecipeDAORepository {
        return RecipeDAORepository(recipeDAO)
    }

}