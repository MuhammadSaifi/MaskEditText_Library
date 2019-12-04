package com.example.maskedittext_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
//implementation 'com.github.pinball83:masked-edittext:1.0.4'

//maven { url 'https://jitpack.io' add in Gradle file Build.Gradle(project:Mask..)
class MainActivity : AppCompatActivity() {


    // by that we can format any type of phone country codes extraa and id card etc.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showText(v: View){
        val msg = edit.text.toString().toInt()


        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
    fun showRawText(v: View){
        val msg2 = edit.text.toString().toInt()
        Toast.makeText(this,msg2,Toast.LENGTH_SHORT).show()
    }
}
