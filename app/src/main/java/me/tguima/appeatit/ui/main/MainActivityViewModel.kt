package me.tguima.appeatit.ui.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import android.content.Context
import android.util.Log
import io.reactivex.disposables.CompositeDisposable
import me.tguima.appeatit.data.local.repository.RecipeDAORepository
import me.tguima.appeatit.data.remote.repository.RecipeRepository
import me.tguima.appeatit.data.remote.response.Response
import me.tguima.appeatit.data.remote.response.Status
import me.tguima.appeatit.model.Recipe
import me.tguima.appeatit.ui.base.BaseViewModel
import me.tguima.appeatit.utils.extensions.dispose
import me.tguima.appeatit.utils.schedules.BaseScheduler
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
        private val scheduler: BaseScheduler,
        private val recipeRepository: RecipeRepository,
        private val recipeDAORepository: RecipeDAORepository
) : BaseViewModel<List<Recipe>>() {

    val TAG = "MAIN_VIEWMODEL"

    init {
        recipeDAORepository.getAllRecipesLive().observeForever {
            Log.d(TAG,"changed size ${it!!.size}")
        }
    }

    fun loadPage(page : Int = 1) {
        var s = recipeRepository.getRecipes()
                .subscribeOn(scheduler.io())
                .observeOn(scheduler.ui())
                .doOnSubscribe { loadingStatus.setValue(true) }
                .doAfterTerminate { loadingStatus.setValue(false) }
                .subscribe({ result ->
                    Log.d(TAG,result[0].toString())
                    recipeDAORepository.insert(result)
                    response.value = (Response(Status.SUCCESS, result, null))
                }, {
                    throwable -> response.setValue(Response(Status.ERROR, null, throwable))
                })
    }

    fun addRecipe() {
    }


}