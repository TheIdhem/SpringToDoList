package com.todolist.demo.todo

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table


@Table
class ToDo(
        @PrimaryKey
        var id:String,
        var description:String,
        var isChecked:Boolean)


