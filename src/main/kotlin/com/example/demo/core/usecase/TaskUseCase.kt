package com.example.demo.core.usecase

import com.example.demo.core.domain.*
import org.springframework.stereotype.Service

@Service
class TaskUseCase(
    private val taskRepository: ITaskRepository,
    private val taskDomainService: TaskDomainService
) {
    fun list(): List<TaskDto>? {
        return taskRepository.findAll()?.map { TaskDto(it.id!!.value,it.name.value) }
    }

    fun get(id: TaskId): Task? {
        return taskRepository.find(id)
    }

    fun create(name:String, userId: Int, groupId: Int): TaskId {
        return taskDomainService.create(name, userId, groupId)
    }
}