package me.tguima.appeatit.ui.adapter.viewholder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import me.tguima.appeatit.databinding.ListRecipeItemBinding

class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

//    val binding: ListColorsItemBinding? = DataBindingUtil.bind(view)
    val binding : ListRecipeItemBinding? = DataBindingUtil.bind(view)

}