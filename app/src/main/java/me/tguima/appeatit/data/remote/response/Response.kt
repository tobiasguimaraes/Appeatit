package me.tguima.appeatit.data.remote.response

object Status {
    val ERROR: Int = 0
    val SUCCESS: Int = 1
}

data class Response<out T> (
        val status: Int,
        val data: T?,
        val error: Throwable?
)