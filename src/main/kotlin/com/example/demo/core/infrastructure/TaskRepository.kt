package com.example.demo.core.infrastructure

import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.Tasks
import com.example.demo.core.domain.ITaskRepository
import com.example.demo.core.domain.Task
import com.example.demo.core.domain.TaskId
import com.example.demo.core.domain.TaskName
import com.example.demo.core.shared.exception.ValidationException
import org.jooq.*
import org.springframework.stereotype.Repository
import java.sql.Timestamp

@Repository
class TaskRepository(private val ctx: DSLContext) : ITaskRepository {

    override fun findAll(): List<Task>? {
        val result: Result<Record6<Int, String, Int, Int, Timestamp, Timestamp>>? = ctx.select(
            Tasks.TASKS.ID,
            Tasks.TASKS.NAME,
            Tasks.TASKS.USER_ID,
            Tasks.TASKS.GROUP_ID,
            Tasks.TASKS.CREATED_ON,
            Tasks.TASKS.UPDATED_ON
        )
            .from(Tasks.TASKS)
            .fetch()

        if (result != null) {
            val list = result.map { r ->
                r.get(Tasks.TASKS.NAME)
                Task(TaskId(r.get(Tasks.TASKS.ID)), TaskName(r.get(Tasks.TASKS.NAME)),r.get(Tasks.TASKS.USER_ID),r.get(Tasks.TASKS.GROUP_ID))
            }
            return list
        }
        return null
    }

    override fun find(id: TaskId): Task {
        val result: Record6<Int, String, Int, Int, Timestamp, Timestamp>? = ctx.select(
            Tasks.TASKS.ID,
            Tasks.TASKS.NAME,
            Tasks.TASKS.USER_ID,
            Tasks.TASKS.GROUP_ID,
            Tasks.TASKS.CREATED_ON,
            Tasks.TASKS.UPDATED_ON
        )
            .from(Tasks.TASKS)
            .where(Tasks.TASKS.ID.eq(id.value))
            .firstOrNull()

        result?.let{
            return Task(TaskId(result.get(Tasks.TASKS.ID)), TaskName(result.get(Tasks.TASKS.NAME)),result.get(Tasks.TASKS.USER_ID),result.get(Tasks.TASKS.GROUP_ID))
        } ?: throw ValidationException("存在しないIDです。")
    }

    override fun save(task: Task): TaskId {
        val record = ctx.newRecord(Tasks.TASKS)
        record.name = task.name.value
        record.userId = task.userId
        record.groupId = task.groupId
        record.store()
        return TaskId(record.id)
    }
}
