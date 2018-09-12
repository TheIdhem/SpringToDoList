package com.todolist.demo.todo


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import org.springframework.http.HttpStatus
import com.datastax.driver.core.utils.UUIDs
import org.omg.CORBA.Object
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping




@RestController
class ToDoController{
    @Autowired
    var toDoServices =ToDoServices()

    @GetMapping("/todos")
    fun getAllToDo():List<ToDo>{
        return toDoServices.getAllToDo()
    }

    @PostMapping("/todos")
    fun addToDo(@RequestBody toDo:ToDo):ResponseEntity<ToDo>{
        return toDoServices.addToDo(toDo)
    }

    @PutMapping("/todos")
    fun updateToDo(@RequestBody toDo:ToDo):ResponseEntity<ToDo>{
        return toDoServices.updateToDo(toDo)
    }

    @DeleteMapping("/todos/{id}")
    fun deleteToDo(@PathVariable("id") id:String):ResponseEntity<String>{
        return toDoServices.deleteToDo(id)
    }


}


