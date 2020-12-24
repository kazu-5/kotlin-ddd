package com.example.demo.api.controller

data class TaskCreateRequestBody(
    var name: String,
    var groupId: Int) {
}