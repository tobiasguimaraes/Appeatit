package me.tguima.appeatit.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import me.tguima.appeatit.R
import me.tguima.appeatit.model.Recipe
import me.tguima.appeatit.ui.adapter.viewholder.RecipeViewHolder
import me.tguima.appeatit.ui.base.BaseAdapter

class ListRecipeAdapter constructor(list: List<Recipe>) : BaseAdapter<Recipe>(list) {
    override fun onCreateViewHolderBase(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return RecipeViewHolder(LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.list_recipe_item, parent, false))
    }

    override fun onBindViewHolderBase(holder: RecyclerView.ViewHolder?, position: Int) {
        val binding = (holder as RecipeViewHolder).binding
        val recipe = list[position]
        binding?.recipe = recipe
    }

}