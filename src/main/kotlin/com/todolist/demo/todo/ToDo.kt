package com.todolist.demo.todo

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table


@Table
class ToDo(var description:String,var isChecked:Boolean){

    @PrimaryKey
    var id: String? = null
}
