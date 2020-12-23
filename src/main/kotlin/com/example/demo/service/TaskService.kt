package com.example.demo.service

import com.example.demo.domain.ITaskRepository
import com.example.demo.domain.Task
import org.springframework.stereotype.Service

@Service
class TaskService(
    private val taskRepository: ITaskRepository
) {
    fun list(): List<Task> {
        return taskRepository.findAll()
    }
}