package com.example.demo.controller

import com.example.demo.core.service.TaskService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tasks")
class TasksController(private val taskService: TaskService) {

    @GetMapping("")
    fun index(): String {
        val tasks = taskService.list()
        println(tasks)
        return ""
    }
}