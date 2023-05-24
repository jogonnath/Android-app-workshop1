package com.example.firstsecondclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.hire_me_tv_id).setOnClickListener {
            Toast.makeText(this,"Hair Me Button Click", Toast.LENGTH_SHORT).show()
        }
        findViewById<TextView>(R.id.download_cv_tv_id).setOnClickListener {
            Toast.makeText(this, "Download CV",Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.contace_me_button).setOnClickListener {
            startActivity(Intent(this,ContactMe::class.java))
        }
    }
}