package com.todolist.demo.todo

import com.todolist.demo.repo.ToDoRepository
import org.springframework.stereotype.Service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus


@Service
class ToDoServices {

    @Autowired
    private lateinit var repository: ToDoRepository
    private var id: String = ""


    fun getAllToDo(): Any {
        val result = repository.findAll()
        if (result.size != 0) {
            id = result[result.size - 1].id
            return result
        } else {
            return emptyArray<ToDo>()
        }
    }

    fun addToDo(toDo: ToDo): ResponseEntity<ToDo> {
        toDo.id = id + 1
        id = toDo.id
        val _toDo = repository.save(toDo)

        return ResponseEntity<ToDo>(_toDo, HttpStatus.OK)
    }

    fun updateToDo(toDo: ToDo): ResponseEntity<ToDo> {
        val toDoData = repository.findById(toDo.id)

        if (toDoData.isPresent())
            return ResponseEntity<ToDo>(repository.save(toDo), HttpStatus.OK)
        else
            return ResponseEntity<ToDo>(HttpStatus.NOT_FOUND)

    }

    fun deleteToDo(id: String): ResponseEntity<String> {

        repository.deleteById(id);

        return ResponseEntity<String>("todo $id is deleted", HttpStatus.OK)
    }

}