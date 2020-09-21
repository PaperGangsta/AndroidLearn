package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MessageActivity","Running in onCreate()")
        button1.setOnClickListener {
            Log.i("button1Onclick","Create Activity2")
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }
}
