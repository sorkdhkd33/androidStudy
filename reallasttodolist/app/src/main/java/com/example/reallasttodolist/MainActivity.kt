package com.example.reallasttodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.reallasttodolist.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.database.*

class MainActivity : AppCompatActivity(), UpdateAndDelete {
    lateinit var database: DatabaseReference
    var toDoList:MutableList<TodoModel>? = null
    lateinit var adapter: ToDoAdapter
    private var listViewItem: ListView?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         
        setContentView(R.layout.activity_main)


        val binding = ActivityMainBinding.inflate(layoutInflater)

        listViewItem=findViewById<ListView>(R.id.item_listView) as ListView
        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        database = FirebaseDatabase.getInstance().reference
        binding.fab.setOnClickListener{
            val alertDialog = AlertDialog.Builder(this)
            val textEditText = EditText(this)
            alertDialog.setMessage("Add TODO item")
            alertDialog.setTitle("Enter To Do item")
            alertDialog.setView(textEditText)
            alertDialog.setPositiveButton("Add"){dialog, which ->
                val todoItemData = TodoModel.createList()
                todoItemData.itemDataText = textEditText.text.toString()
                todoItemData.done = false

                val newItemData = database.child("todo").push()
                todoItemData.UID = newItemData.key

                newItemData.setValue(todoItemData)

                dialog.dismiss()
                Toast.makeText(this, "item saved", Toast.LENGTH_LONG).show()
            }
            alertDialog.show()
        }

        toDoList= mutableListOf<TodoModel>()

        adapter= ToDoAdapter(this,toDoList!!)
        listViewItem!!.adapter=adapter

        database.addValueEventListener(object : ValueEventListener{
            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(applicationContext, "No item Added", Toast.LENGTH_LONG).show()
            }

            override fun onDataChange(snapshot: DataSnapshot) {
                toDoList!!.clear()
                addItemToList(snapshot)
            }
        })
    }

    private fun addItemToList(snapshot: DataSnapshot) {
        val items=snapshot.children.iterator()

        if(items.hasNext()){
            val toDoInDexValue = items.next()
            val itemsIterator = toDoInDexValue.children.iterator()

            while (itemsIterator.hasNext()){
                val currentItem = itemsIterator.next()
                val toDOItemData = TodoModel.createList()
                val map = currentItem.getValue() as  HashMap<String,Any>

                toDOItemData.UID = currentItem.key
                toDOItemData.done = map.get("done")as Boolean?
                toDOItemData.itemDataText = map.get("itemDataText") as String?

                toDoList!!.add(toDOItemData)
            }
        }
        adapter.notifyDataSetChanged()
    }

    override fun modifyItem(itemUID: String, isDone: Boolean) {
        val itemReference=database.child("todo").child(itemUID)
        itemReference.child("done").setValue(isDone)
    }

    override fun onItemDelete(itemUID: String) {
        val itemReference = database.child("todo").child(itemUID)
        itemReference.removeValue()
        adapter.notifyDataSetChanged()
    }
}