package com.example.demo.core.usecase

import com.example.demo.core.domain.ITaskRepository
import com.example.demo.core.domain.Task
import com.example.demo.core.domain.TaskId
import org.springframework.stereotype.Service

@Service
class TaskUseCase(
    private val taskRepository: ITaskRepository
) {
    fun list(): List<Task> {
        return taskRepository.findAll()
    }

    fun get(id: TaskId): Task? {
        return taskRepository.find(id)
    }
}