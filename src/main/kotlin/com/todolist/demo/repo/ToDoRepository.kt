package com.todolist.demo.repo


import org.springframework.data.cassandra.repository.CassandraRepository

import com.todolist.demo.todo.ToDo


interface ToDoRepository : CassandraRepository<ToDo, String> {
}