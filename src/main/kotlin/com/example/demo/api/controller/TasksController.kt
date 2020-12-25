package com.example.demo.api.controller

import com.example.demo.api.controller.shared.response.EmptyResponse
import com.example.demo.api.controller.shared.response.IResponse
import com.example.demo.api.controller.shared.response.Response
import com.example.demo.api.controller.shared.response.ValidationResponse
import com.example.demo.com.example.demo.core.infrastructure.jooq.generated.tables.Tasks
import com.example.demo.core.domain.Task
import com.example.demo.core.domain.TaskId
import com.example.demo.core.domain.TaskName
import com.example.demo.core.shared.exception.ValidationException
import com.example.demo.core.usecase.TaskDetailDto
import com.example.demo.core.usecase.TaskDto
import com.example.demo.core.usecase.TaskUseCase
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/tasks")
class TasksController(private val taskUseCase: TaskUseCase) {

    @GetMapping("")
    fun index(): IResponse {
        val tasks:List<TaskDto>? = taskUseCase.list()?.map {
            TaskDto(it.id, it.name)
        }
        tasks?.let{
            return Response<List<TaskDto>>(tasks)
        } ?: return EmptyResponse()
    }

    @GetMapping("/{taskId}")
    fun show(@PathVariable taskId: Int): IResponse {
        val task = taskUseCase.get(TaskId(taskId))
        task?.let{
            return Response<TaskDetailDto>(TaskDetailDto(task.id!!.value,task.name.value))
        } ?: return EmptyResponse()
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    fun post(@RequestBody body: TaskCreateRequestBody): IResponse {
        val taskId:TaskId = taskUseCase.create(body.name, 1, body.groupId)
        return Response<TaskId>(taskId)
    }

    @ExceptionHandler(ValidationException::class)
    fun validation(req: HttpServletRequest, exception: ValidationException):ValidationResponse {
        return ValidationResponse(exception.validationMessage)
    }
}