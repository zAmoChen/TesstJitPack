package com.test.tesstjitpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.library.AlertUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AlertUtils.show(this)
    }
}