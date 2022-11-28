package com.example.adminownerhatrick

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD
import android.widget.Button
=======
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
>>>>>>> b1569ce (new AO)
import com.google.firebase.ktx.Firebase

class createField : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_field)
<<<<<<< HEAD
        storageRef = Firebase.s.reference;
        val btnSelectImage = findViewById<Button>(R.id.BTN)
        // button Click listener
// invoke on user interaction
        btnSelectImage.setOnClickListener {
            // PICK INTENT picks item from data
            // and returned selected item
            val galleryIntent = Intent(Intent.ACTION_PICK)
            // here item is type of image
            galleryIntent.type = "image/*"
            // ActivityResultLauncher callback
            imagePickerActivityResult.launch(galleryIntent)
        }
=======
        val sportType: Spinner = findViewById(R.id.sportType)
        var sports = arrayOf("Football", "Basketball", "Tennis", "Handball")
        sportType.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sports)
        val locat: Spinner = findViewById(R.id.fieldLocationSpn)
        var locations = arrayOf("Jbiha", "Shafa Badran", "Abo Nsair", "Khalda")
        locat.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, locations)

//        storageRef = Firebase.s.reference;
//        val btnSelectImage = findViewById<Button>(R.id.BTN)
//        // button Click listener
//// invoke on user interaction
//        btnSelectImage.setOnClickListener {
//            // PICK INTENT picks item from data
//            // and returned selected item
//            val galleryIntent = Intent(Intent.ACTION_PICK)
//            // here item is type of image
//            galleryIntent.type = "image/*"
//            // ActivityResultLauncher callback
//            imagePickerActivityResult.launch(galleryIntent)
//        }
>>>>>>> b1569ce (new AO)
    }
}