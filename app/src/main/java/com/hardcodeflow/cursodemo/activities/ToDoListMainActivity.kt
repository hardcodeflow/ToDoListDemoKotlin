package com.hardcodeflow.cursodemo.activities

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.hardcodeflow.cursodemo.R
import com.hardcodeflow.cursodemo.adapters.ToDoListAdapter
import kotlinx.android.synthetic.main.activity_to_do_list_main.*
import kotlinx.android.synthetic.main.content_to_do_list_main.*

class ToDoListMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do_list_main)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }


        var toDoListAdapter=ToDoListAdapter()

        //todoListRecyclerView.adapter=toDoListAdapter



    }
}
