package com.example.todolistfinal

import com.example.todolistfinal.databinding.ActivityMainBinding
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.kotlin.createObject


open class Todo (
    @PrimaryKey var id : Long = 0,
    var title : String = "",
    var date : Long = 0
    ): RealmObject(){
    private lateinit var binding: ActivityMainBinding
    private fun insertTodo()
    {
        binding = ActivityMainBinding.inflate()
        val view  = binding.root
        realm.beginTransaction()
        val newItem = realm.createObject<Todo>(nextId())
        newItem.title = todoEdittext.text.toSrtring()
        newItem.date = calender.timeInMillis

        realm.commitTransaction()

        alert
}


