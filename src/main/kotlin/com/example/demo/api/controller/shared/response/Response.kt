package com.example.demo.api.controller.shared.response

class Response<T> {
    private var data: T? = null
    private var statusSuccess = false
    fun Response(data: T) {
        statusSuccess = true
        this.data = data
    }
}