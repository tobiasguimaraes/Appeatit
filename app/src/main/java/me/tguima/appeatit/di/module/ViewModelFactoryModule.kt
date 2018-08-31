package me.tguima.appeatit.di.module

import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import me.tguima.appeatit.utils.ViewModelFactory

@Module
interface ViewModelFactoryModule {
    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}