package me.tguima.appeatit.ui.base

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import me.tguima.appeatit.data.remote.response.Response

abstract class BaseViewModel<T> : ViewModel() {

    val data: MutableLiveData<T> = MutableLiveData()

    val response: MutableLiveData<Response<T>> = MutableLiveData()

    val loadingStatus: MutableLiveData<Boolean> = MutableLiveData()

}