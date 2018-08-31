package me.tguima.appeatit.ui.main

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import me.tguima.appeatit.model.Recipe
import me.tguima.appeatit.ui.adapter.ListRecipeAdapter

object MainActivityBindings {

    @JvmStatic
    @BindingAdapter("load_recipes")
    fun loadRecipes(recyclerView: RecyclerView, recipes: List<Recipe>?) {
        recyclerView.adapter = if (recipes != null) ListRecipeAdapter(recipes) else ListRecipeAdapter(emptyList())
    }
}