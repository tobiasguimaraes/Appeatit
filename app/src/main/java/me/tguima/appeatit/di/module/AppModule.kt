package me.tguima.appeatit.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import me.tguima.appeatit.App
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: App) : Context =  app.applicationContext
}