package com.todolist.demo.todo

import com.todolist.demo.repo.ToDoRepository
import org.springframework.stereotype.Service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus



@Service
class ToDoServices{

    @Autowired
    private lateinit var repository: ToDoRepository


    fun getAllToDo():List<ToDo>{
        return repository.findAll();
    }

    fun addToDo(toDo:ToDo): ResponseEntity<ToDo> {
        val _toDo = repository.save(toDo)

        return ResponseEntity<ToDo>(_toDo, HttpStatus.OK)
    }

    fun updateToDo(toDo:ToDo):ResponseEntity<ToDo>{
        val toDoData = repository.findById(toDo.id)

        if(toDoData.isPresent()){

            return ResponseEntity<ToDo>(repository.save(toDo), HttpStatus.OK)
        }
        else{
            return ResponseEntity<ToDo>(HttpStatus.NOT_FOUND)
        }
    }

    fun deleteToDo(id:String):ResponseEntity<String>{

       repository.deleteById(id);

        return ResponseEntity<String>("todo is deleted $id",HttpStatus.OK)
    }

}