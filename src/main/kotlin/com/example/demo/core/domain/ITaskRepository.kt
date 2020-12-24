package com.example.demo.core.domain

interface ITaskRepository {
    fun findAll(): List<Task>?

    fun find(id: TaskId): Task

    fun save(task: Task): TaskId
}