package com.example.myloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class BoardWriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_write)

        val backBtn = findViewById<Button>(R.id.backBtn)
        backBtn.setOnClickListener {

            val intent = Intent(this, BoardListActivity::class.java)
            startActivity(intent)

        }

        // val writeBtn = findViewById<Button>(R.id.writeUploadBtn)
        val writeBtn:Button = findViewById(R.id.writeUploadBtn)
        writeBtn.setOnClickListener {

            val writeText = findViewById<EditText>(R.id.writeTextArea)

            // Write a message to the database
            val database = Firebase.database
            val myRef = database.getReference("board")

            myRef.push().setValue(Model(writeText.text.toString()))
            Toast.makeText(this, "정상적으로 글이 작성 되었습니다.", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, BoardListActivity::class.java)
            startActivity(intent)

        }
    }
}