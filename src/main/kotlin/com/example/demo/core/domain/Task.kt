package com.example.demo.core.domain

// aggregate
class Task(_id: TaskId?, _name: TaskName, _userId:Int, _groupId:Int) {
    val id: TaskId?
    val name: TaskName
    val userId: Int
    val groupId: Int
    init {
        id = _id
        name = _name
        userId = _userId
        groupId = _groupId
    }
}

// value objects
data class TaskId(val value: Int)

data class TaskName(val value: String)