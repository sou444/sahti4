package com.example.slemti

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_symptons.*


class SymptonsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptons)
    }

    public fun GoToMainPage(view: View) {

        val intent: Intent = Intent(this, MainPageActivity::class.java)
        startActivity(intent)


    }



    fun UserProfile(view: View) {
        val intent: Intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
    fun OpenBotPage(view:View){

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.chatbot.com/preview/?widgetId=5e9afe0434de0f0007fc73b9"))
        startActivity(intent)

    }

}
