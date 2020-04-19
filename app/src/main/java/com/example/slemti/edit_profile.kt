package com.example.slemti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class edit_profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
    }

    fun GoToMainPage(view: View) {
        val intent: Intent = Intent(this, MainPageActivity::class.java)
        startActivity(intent)}

    fun save(view: View) {}
}
