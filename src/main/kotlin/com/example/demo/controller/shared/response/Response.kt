package com.example.demo.controller.shared.response

class Response<T> {
    private var data: T? = null
    private var statusSuccess = false
    fun Response(data: T) {
        statusSuccess = true
        this.data = data
    }
}