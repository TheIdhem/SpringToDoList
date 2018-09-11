package com.todolist.demo.todo


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
class ToDoController{

    var toDos: List<ToDo> = ArrayList(Arrays.asList(
            ToDo("Spring", "Spring FrameWork", true),
            ToDo("java", "Core Java", false),
            ToDo("javascript", "Javascript", false)
    ))

    @GetMapping("/todos")
    fun getAllToDo():List<ToDo>{
        return toDos
    }

}


