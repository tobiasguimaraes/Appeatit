package me.tguima.appeatit.di.ui

import android.arch.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import me.tguima.appeatit.ui.main.MainActivityViewModel
import me.tguima.appeatit.utils.ViewModelFactory
import me.tguima.appeatit.utils.ViewModelKey

@Module(includes = [ViewModelFactoryModule::class])
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    fun bindMainActivityViewModel(viewModel: MainActivityViewModel) : ViewModel

}