package com.mrflaitx.distart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mrflaitx.distart.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
            //проверяем запуском приложения (инициализацию клавы)
        activity.computer.toString()
    }
}