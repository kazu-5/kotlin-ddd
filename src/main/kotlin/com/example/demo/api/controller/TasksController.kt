package com.example.demo.api.controller

import com.example.demo.core.usecase.TaskUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tasks")
class TasksController(private val taskService: TaskUseCase) {

    @GetMapping("")
    fun index(): String {
        val tasks = taskService.list()
        println(tasks)
        return ""
    }
}