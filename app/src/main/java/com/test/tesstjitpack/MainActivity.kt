package com.test.tesstjitpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.library.AlertUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AlertUtils.show(this)
    }
}