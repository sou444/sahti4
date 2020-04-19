package com.example.slemti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        auth = FirebaseAuth.getInstance()
        BackImg.setOnClickListener({
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })
    }

    public fun LoginMain(view: View) {
        if (EmailLogin.text.isEmpty() || PwLogin.text.isEmpty()) {
            ErrorTxt.animate().alpha(1f)
        } else {
            Toast.makeText(this,"Logging in...",Toast.LENGTH_SHORT).show()
            val loginemail = EmailLogin.text.toString().trim()
            val loginpw = PwLogin.text.toString().trim()
            auth.signInWithEmailAndPassword(loginemail, loginpw)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val intent: Intent = Intent(this, MainPageActivity::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        ErrorTxt.animate().alpha(1f)
                    }


                }


        }

    }
}
