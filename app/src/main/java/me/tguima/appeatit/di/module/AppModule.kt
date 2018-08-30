package me.tguima.appeatit.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import me.tguima.appeatit.App
import me.tguima.appeatit.di.ui.ViewModelModule
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: App) : Context =  app.applicationContext
}