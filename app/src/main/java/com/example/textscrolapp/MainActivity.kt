package com.example.textscrolapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onBackPressed() {
       val builder = AlertDialog.Builder(this)
        builder.setTitle("Are you sure ?")
        builder.setMessage("Do you want to close this app? ")
        builder.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        builder.setNegativeButton("No", { dialogInterface: DialogInterface, i: Int -> })
        builder.show()
    }

    lateinit var text: EditText
    lateinit var view: TextView
    lateinit var send: Button
    lateinit var cancel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.ed_text) as EditText
        view = findViewById(R.id.tv_view) as TextView
        send = findViewById(R.id.btn_send) as Button
        cancel = findViewById(R.id.btn_cancel)

        btn_send.setOnClickListener {
            val name = ed_text.text
            tv_view.setSingleLine()
            tv_view.isSelected = true
            tv_view.text = name


        }
        btn_cancel.setOnClickListener {
            tv_view.text = ""
        }
    }
}

