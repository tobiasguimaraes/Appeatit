package me.tguima.appeatit.ui.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import me.tguima.appeatit.R
import me.tguima.appeatit.data.remote.response.Status
import me.tguima.appeatit.databinding.ActivityMainBinding
import me.tguima.appeatit.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProviders
                .of(this, viewModelFactory)
                .get(MainActivityViewModel::class.java)

        binding.viewModel = viewModel

        binding.setLifecycleOwner(this)

        registerRecipeObserver()
    }

    private fun registerRecipeObserver() {
        viewModel.response.observe(this, Observer { response ->
            if(response != null && response.status == Status.SUCCESS) {
                //setup recycler ?
            }else {
                Snackbar.make(binding.root, "ERRO LOADING", Snackbar.LENGTH_LONG).show()

            }
        })
    }


}
