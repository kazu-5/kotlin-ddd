package com.example.demo.core.domain

interface ITaskRepository {
    fun findAll(): List<Task>
}