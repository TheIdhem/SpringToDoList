package com.todolist.demo.todo

import org.springframework.stereotype.Service
import java.util.*

@Service
class ToDoServices{

    var toDos: List<ToDo> = ArrayList(Arrays.asList(
            ToDo("Spring", "Spring FrameWork", true),
            ToDo("java", "Core Java", false),
            ToDo("javascript", "Javascript", false)
    ))


    fun getAllToDo():List<ToDo>{
        return toDos
    }
}