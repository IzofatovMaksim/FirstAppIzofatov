package com.example.firstappizofatov

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<TextView>(R.id.textView1)
        if(android.os.Build.VERSION.SDK_INT > Build.VERSION_CODES.N){
            txt.setTextColor(R.color.blue.toInt())
            //findViewById<TextView>(R.id.textView1).setTextColor(resources.getColor(R.color.blue))
        }
        else
        {
            txt.setTextColor(R.color.red.toInt())
        }
    }

}