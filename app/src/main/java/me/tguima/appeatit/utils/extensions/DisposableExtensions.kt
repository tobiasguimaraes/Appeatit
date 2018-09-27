package me.tguima.appeatit.utils.extensions

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

fun Disposable.dispose() {
    CompositeDisposable().let { cd ->
        cd.add(this)
        cd.dispose()
    }
}