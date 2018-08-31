package me.tguima.appeatit.ui.main

import android.arch.lifecycle.ViewModel
import me.tguima.appeatit.data.remote.repository.RecipeRepository
import me.tguima.appeatit.data.remote.response.Response
import me.tguima.appeatit.data.remote.response.Status
import me.tguima.appeatit.model.Recipe
import me.tguima.appeatit.ui.base.BaseViewModel
import me.tguima.appeatit.utils.schedules.BaseScheduler
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
        private val scheduler: BaseScheduler,
        private val recipeRepository: RecipeRepository
) : BaseViewModel<List<Recipe>>() {

    override fun loadData() {
        recipeRepository.getRecipes()
                .subscribeOn(scheduler.io())
                .observeOn(scheduler.ui())
                .doOnSubscribe { loadingStatus.setValue(true) }
                .doAfterTerminate { loadingStatus.setValue(false) }
                .subscribe({
                    result -> response.setValue(Response(Status.SUCCESS, result, null))
                }, {
                    throwable -> response.setValue(Response(Status.ERROR, null, throwable))
                })

    }


}