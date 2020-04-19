package com.example.slemti

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_make_account.*


class MakeAccount : AppCompatActivity() {
     lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_account)
        val TnCity = arrayOf("City","Tunis","Béja","Ben Arous","Bizerte","Gabés","Gafsa","Jendouba","Kairouan","Kasserine","Kebili","Kef","Mahida","Manouba","Medenine","Monastir","Nabeul","Sfax","Ariana","Sidi Bouzid","Siliana","Sousse","Tataouine","Tozeur","Zaghouan")
        UserCity.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, TnCity)
        auth = FirebaseAuth.getInstance()





    }
    public fun SignInFn(view: View){
        CheckUserInfo()

    }

    fun registeruser(email: String, pw: String) {
        auth.createUserWithEmailAndPassword(email, pw)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent: Intent = Intent(this, Main2Activity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(
                        this,
                        "User already registered or Check your internet connection",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }
 public fun CheckUserInfo() {

     val useremail = UserEmail.text.toString().trim()
     val userpw = UserPw.text.toString().trim()



     if (UserName.length() <= 2) {
         UserName.setError("Name is required")
     } else if (UserLastName.length() <= 2) {
         UserLastName.setError("Last Name is required")
     } else if (TextUtils.isEmpty(UserEmail.text.toString())) {
         UserEmail.setError("Email is required")
     } else if ((UserEmail.text.contains("@", true)) == false) {
         UserEmail.setError("Invalid Email")
     } else if ((UserEmail.text.contains(".", true)) == false) {
         UserEmail.setError("Invalid Email")
     } else if (TextUtils.isEmpty(UserPw.text.toString())) {
         UserPw.setError("Password is required")
     } else if (TextUtils.isEmpty(UserCity.selectedItem.toString()) || UserCity.selectedItem.toString() == "City") {
         Toast.makeText(this, "City is required", Toast.LENGTH_SHORT).show()
     } else if (UserAge.text.toString().toInt() <= 0){
         UserAge.setError("Invalid age")
     }else{
         registeruser(useremail,userpw)
     }

 }


    public fun GoBack(view:View){
        val intent : Intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }





}
