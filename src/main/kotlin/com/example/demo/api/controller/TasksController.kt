package com.example.demo.api.controller

import com.example.demo.api.controller.shared.response.EmptyResponse
import com.example.demo.api.controller.shared.response.IResponse
import com.example.demo.api.controller.shared.response.Response
import com.example.demo.core.domain.Task
import com.example.demo.core.domain.TaskId
import com.example.demo.core.usecase.TaskDetailDto
import com.example.demo.core.usecase.TaskDto
import com.example.demo.core.usecase.TaskUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tasks")
class TasksController(private val taskService: TaskUseCase) {

    @GetMapping("")
    fun index(): IResponse {
        println(taskService.list())
        val tasks:List<TaskDto>? = taskService.list()?.map { (id,name) -> TaskDto(id.value, name.value) }
        if (tasks != null) {
            return Response<List<TaskDto>>(tasks)
        } else {
            return EmptyResponse()
        }
    }

    @GetMapping("/{taskId}")
    fun show(@PathVariable taskId: Int): IResponse {
        val task = taskService.get(TaskId(taskId))
        if (task != null) {
            val taskDetail = TaskDetailDto(task.id.value,task.name.value)
            return Response<TaskDetailDto>(taskDetail)
        } else {
            return EmptyResponse()
        }
    }
}