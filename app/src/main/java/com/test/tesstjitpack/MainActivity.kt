package com.test.tesstjitpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.fastyotest.library.YoTestCaptcha
import com.fastyotest.library.YoTestCaptchaVerify
import com.test.library.AlertUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AlertUtils.show(this)
    }
}