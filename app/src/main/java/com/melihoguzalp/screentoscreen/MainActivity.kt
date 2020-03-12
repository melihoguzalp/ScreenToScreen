package com.melihoguzalp.screentoscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("on create called")
    }


    override fun onResume() {
        super.onResume()
        println("on resume called")
    }


    override fun onPause() {
        super.onPause()
        println("on pause called")

    }

    override fun onStop() {
        super.onStop()
        println("on stop called")
    }


    override fun onDestroy() {
        super.onDestroy()
        println("on destroy called")
    }





    fun next(view: View){

        val intent = Intent(applicationContext,SecondPage::class.java)

        intent.putExtra("username",userNameText.text.toString())//bu iki kod satırı ilk sayfada yazılanları ikinci sayfada göstermeye yarar.
        intent.putExtra("name",nameText.text.toString())

        startActivity(intent)
        finish() // yeni sayfaya geçtiği an bir öncekini kapatır.


    }
}
