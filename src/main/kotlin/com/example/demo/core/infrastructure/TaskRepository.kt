package com.example.demo.core.infrastructure

import com.example.demo.core.infrastructure.jooq.generated.Tables
import com.example.demo.core.domain.ITaskRepository
import com.example.demo.core.domain.Task
import com.example.demo.core.domain.TaskId
import com.example.demo.core.domain.TaskName
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class TaskRepository(private val ctx: DSLContext) : ITaskRepository {
    override fun findAll(): List<Task> {
        val records = ctx.select()
            .fetchGroups(Tables.TASKS)

        val list = mutableListOf<Task>()
        list.add(Task(TaskId(1), TaskName("name")))
        return list
    }
}