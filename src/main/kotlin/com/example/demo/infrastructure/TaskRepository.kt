package com.example.demo.infrastructure

import com.example.demo.infrastructure.jooq.generated.Tables
import com.example.demo.domain.ITaskRepository
import com.example.demo.domain.Task
import com.example.demo.domain.TaskId
import com.example.demo.domain.TaskName
import org.jooq.DSLContext
import org.jooq.impl.DSL
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