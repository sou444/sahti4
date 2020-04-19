package com.example.slemti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

class MainActivity : AppCompatActivity() {


    @ExperimentalTime
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TxTView.animate().alpha(1F).setDuration(800)
        LoginBtn.animate().alpha(1F).setDuration(900)
        textView2.animate().alpha(1F).setDuration(900)
        TxTR.animate().alpha(1F).setDuration(900)
        AppImg.animate().alpha(1F).setDuration(2000)
        TxTR.setOnClickListener({

            val intent :Intent  = Intent(this,MakeAccount::class.java)
            startActivity(intent)

        })









    }
    fun LoginFun(view: View){

        val intent :Intent  = Intent(this,Main2Activity::class.java)
        startActivity(intent)




    }
}


