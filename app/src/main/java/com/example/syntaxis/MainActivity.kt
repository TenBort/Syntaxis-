package com.example.syntaxis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val nextActivity = findViewById<Button>(R.id.buttonNext)
//
//        nextActivity.setOnClickListener {
//            nextActiv()
//        }
    }

    override fun onSupportNavigateUp() = findNavController(R.id.fragmentView).navigateUp()

//    fun nextActiv(){
//
//        val nextIntent = Intent(this, MainActivity2::class.java)
//        startActivity(nextIntent)
//    }

}
