package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("Damu","Initial commit")
        Log.e("Damu","Second commit")
        Log.e("Damu","Third commit")
        Log.e("Damu","Tick commit")
    }
}
