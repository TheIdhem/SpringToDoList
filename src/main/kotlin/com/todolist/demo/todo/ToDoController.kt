package com.todolist.demo.todo


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
class ToDoController{
    @Autowired
    var toDoServices =ToDoServices()

    @GetMapping("/todos")
    fun getAllToDo():List<ToDo>{
        return toDoServices.getAllToDo()
    }

}


