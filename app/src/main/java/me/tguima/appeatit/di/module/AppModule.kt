package me.tguima.appeatit.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import me.tguima.appeatit.App
import me.tguima.appeatit.data.remote.Api.RecipeApi
import me.tguima.appeatit.data.remote.repository.RecipeRepository
import me.tguima.appeatit.utils.schedules.BaseScheduler
import me.tguima.appeatit.utils.schedules.SchedulerProvider
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: App) : Context =  app.applicationContext

    @Provides
    @Singleton
    fun provideScheduler(): BaseScheduler {
        return SchedulerProvider()
    }
}