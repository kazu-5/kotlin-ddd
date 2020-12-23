package com.example.demo.core.usecase

import com.example.demo.core.domain.ITaskRepository
import com.example.demo.core.domain.Task
import org.springframework.stereotype.Service

@Service
class TaskUseCase(
    private val taskRepository: ITaskRepository
) {
    fun list(): List<Task> {
        return taskRepository.findAll()
    }
}