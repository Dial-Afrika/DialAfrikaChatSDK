package com.example.bongaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bongasdk.ChatSDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apikey = "a191dc5a-d5be-49f3-90b6-2d1b22d9c9cf"
        val greeting = "Welcome to DialAfrika \uD83D\uDC4B"
        val message = "How can we be of Assistance to you?"

        ChatSDK.initialize(this, apikey, greeting, message)
    }
}