package com.example.demo.api.controller.shared.response

class Response<T>(task: T): IResponse {
    var data: T? = null
    var statusSuccess = false
    fun Response(data: T) {
        statusSuccess = true
        this.data = data
    }

    override fun isStatusSuccess(): Boolean {
        return statusSuccess
    }
}