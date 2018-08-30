package me.tguima.appeatit

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import me.tguima.appeatit.di.DaggerAppComponent

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

}