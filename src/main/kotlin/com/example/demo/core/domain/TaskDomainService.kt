package com.example.demo.core.domain

import com.example.demo.core.infrastructure.UserRepository
import com.example.demo.core.shared.exception.ValidationException
import org.springframework.stereotype.Service

@Service
class TaskDomainService(
    private val taskRepository: ITaskRepository,
    private val userRepository: UserRepository
    ) {
    fun create(name:String, userId:Int, groupId:Int): TaskId{
        if(userRepository.isJoin(userId,groupId)){
            val task = Task(null, TaskName(name), userId, groupId)
            return taskRepository.save(task)
        } else{
            throw ValidationException("参加していないグループです")
        }
    }
}