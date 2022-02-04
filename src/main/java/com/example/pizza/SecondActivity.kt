package com.example.pizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.basket_layout)
    }
}