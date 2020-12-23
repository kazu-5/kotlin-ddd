package com.example.demo.core.infrastructure

import com.example.demo.core.infrastructure.jooq.generated.Tables
import com.example.demo.core.domain.ITaskRepository
import com.example.demo.core.domain.Task
import com.example.demo.core.domain.TaskId
import com.example.demo.core.domain.TaskName
import com.example.demo.core.infrastructure.jooq.generated.tables.Tasks
import org.jooq.*
import org.springframework.stereotype.Repository
import java.sql.Timestamp

@Repository
class TaskRepository(private val ctx: DSLContext) : ITaskRepository {


    override fun findAll(): List<Task> {
        val records: Result<Record5<Int, String, Int, Timestamp, Timestamp>>? = ctx.select(
            Tasks.TASKS.ID,
            Tasks.TASKS.NAME,
            Tasks.TASKS.USER_ID,
            Tasks.TASKS.CREATED_ON,
            Tasks.TASKS.UPDATED_ON
        )
            .from(Tasks.TASKS)
            .fetch()

        if (records != null) {
            val result = records.map { (item) -> records.getValue(0,Tasks.TASKS.NAME) }
            println(result)
        }

        val list = mutableListOf<Task>()
        list.add(Task(TaskId(1), TaskName("name")))
        return list
    }
}

private typealias RecordMapType = Map<Tasks, Result<RecordType>>

private typealias RecordMapEntryType = Map.Entry<Tasks, Result<RecordType>>

private typealias RecordType = Record4<Int, String, String, String>