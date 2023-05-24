package com.example.firstsecondclass

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class ContactMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_me)

        val  num=223432

        val ivProfile = findViewById<ImageView>(R.id.imageview)
        val imageUrl = "https://images.pexels.com/photos/15529247/pexels-photo-15529247.jpeg?auto=compress&cs=tinysrgb&w=260&h=250&dpr=1"

        Glide.with(this)
            .load(imageUrl).into(ivProfile);


        findViewById<Button>(R.id.btnvisitwebsite).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.google.com")))
        }
        findViewById<Button>(R.id.btn_callme).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW).setData(Uri.parse("tel:+8801518484277")))
        }
        findViewById<Button>(R.id.sendmessagebtn).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW).setData(Uri.parse("smsto:$num")))
        }

        findViewById<Button>(R.id.btn_backtohome).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}