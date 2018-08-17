package me.tguima.appeatit.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.tguima.appeatit.App
import me.tguima.appeatit.di.ui.ActivityModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityModule::class
])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

}