package dev.itjunior.y2s4mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edButton = findViewById<Button>(R.id.button)
        edButton.setOnClickListener {
            val intent = Intent (this, Skills ::class.java)
            startActivity(intent)
        }
    }


}