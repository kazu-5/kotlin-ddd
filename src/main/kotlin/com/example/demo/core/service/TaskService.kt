package com.example.demo.core.service

import com.example.demo.core.domain.ITaskRepository
import com.example.demo.core.domain.Task
import org.springframework.stereotype.Service

@Service
class TaskService(
    private val taskRepository: ITaskRepository
) {
    fun list(): List<Task> {
        return taskRepository.findAll()
    }
}