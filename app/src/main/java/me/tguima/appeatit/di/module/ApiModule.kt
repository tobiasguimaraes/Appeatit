package me.tguima.appeatit.di.module

import dagger.Module
import dagger.Provides
import me.tguima.appeatit.data.remote.Api.RecipeApi
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ApiModule {
    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit) : RecipeApi {
        return retrofit.create(RecipeApi::class.java)
    }

}