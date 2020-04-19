package com.example.slemti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_page.*
import kotlinx.android.synthetic.main.activity_main_page.UserProfile


import kotlinx.android.synthetic.main.activity_symptons.*
import kotlinx.android.synthetic.main.activity_tips.*


class MainPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

    }
    public fun SymptonsFn (view: View){

        val intent: Intent = Intent(this, SymptonsActivity::class.java)
        startActivity(intent)


    }
    public fun TipsPage(view:View){
        val intent: Intent = Intent(this, TipsActivity::class.java)
        startActivity(intent)

    }
    public fun UserProfile(view:View){

        val intent: Intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }



    fun ToMap(view: View) {

        val intent: Intent = Intent(this, CoronaMapActivity::class.java)
        startActivity(intent)

    }
}
