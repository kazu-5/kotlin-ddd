package com.example.demo.core.domain

// aggregate
data class Task(val id: TaskId?, val name: TaskName, val userId:Int, val groupId:Int) {
}

// value objects
data class TaskId(val value: Int)

data class TaskName(val value: String)