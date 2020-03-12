package com.melihoguzalp.screentoscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second_page.*

class SecondPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)


        //get Intent

        val intent = intent
        val username = intent.getStringExtra("username")
        val name = intent.getStringExtra("name")

        userNameTextNextActivity.text = "Username : " + username
        nameTextNextActivity.text = "Name : " + name





    }




}
