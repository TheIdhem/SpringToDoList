package com.todolist.demo.todo

import com.todolist.demo.repo.ToDoRepository
import org.springframework.stereotype.Service
import java.util.*
import org.springframework.beans.factory.annotation.Autowired



@Service
class ToDoServices{

    @Autowired
    var repository: ToDoRepository? = null



    fun getAllToDo():List<ToDo>{
        return repository!!.findAll();
    }
}