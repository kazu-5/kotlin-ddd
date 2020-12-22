package controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TasksController {
    @GetMapping("/qiitas")
    fun index(): String {
        println("test456")
        return ""
    }
}