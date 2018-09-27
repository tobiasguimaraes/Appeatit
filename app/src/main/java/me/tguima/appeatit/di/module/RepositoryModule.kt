package me.tguima.appeatit.di.module

import dagger.Module
import dagger.Provides
import me.tguima.appeatit.data.remote.Api.RecipeApi
import me.tguima.appeatit.data.remote.repository.RecipeRepository
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRecipeRepository(api: RecipeApi): RecipeRepository {
        return RecipeRepository(api)
    }
}