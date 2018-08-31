package me.tguima.appeatit.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.tguima.appeatit.App
import me.tguima.appeatit.di.module.AppModule
import me.tguima.appeatit.di.module.NetworkModule
import me.tguima.appeatit.di.module.ActivityModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityModule::class,
    AppModule::class,
    NetworkModule::class
])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

}