package com.example.slemti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.lifecycle.ViewModelStore
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main2.*

import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)



    }

    public fun GoToMainPage(view: View){

        val intent: Intent = Intent(this, MainPageActivity::class.java)
        startActivity(intent)
    }


    fun editprofile(view: View) {
        val intent: Intent = Intent(this, edit_profile::class.java)
        startActivity(intent)

    }
}
