package com.example.adminownerhatrick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class AdminOROwner : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_orowner)
        var admin : Button = findViewById(R.id.AdminBtn)
        var owner : Button = findViewById(R.id.OwnerBtn)

        admin.setOnClickListener {
            val intent = Intent(this , AdminSignin::class.java)
            startActivity(intent)
        }
        owner.setOnClickListener {
            val intent = Intent(this , OwnerSignin::class.java)
            startActivity(intent)
        }

    }
}