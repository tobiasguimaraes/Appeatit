package me.tguima.appeatit.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.tguima.appeatit.ui.base.BaseActivity
import me.tguima.appeatit.ui.main.MainActivity

@Module
interface ActivityModule {

    @ContributesAndroidInjector
    fun  contributeBaseActivity() : BaseActivity

    @ContributesAndroidInjector
    fun  contributeMainActivity() : MainActivity
}