package com.example.demo.domain

interface ITaskRepository {
    fun findAll(): List<Task>
}