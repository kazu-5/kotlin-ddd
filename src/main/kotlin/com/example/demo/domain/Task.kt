package com.example.demo.domain

// aggregate
data class Task(
    val id: TaskId,
    val name: TaskName){
}

// value objects
data class TaskId(val value: Int)

data class TaskName(val value: String)