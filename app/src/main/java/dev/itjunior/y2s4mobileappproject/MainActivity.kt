package dev.itjunior.y2s4mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonSkills = findViewById<Button>(R.id.skills)
        ButtonSkills.setOnClickListener {
            val intent = Intent (this, Skills ::class.java)
            startActivity(intent)
        }
        val ButtonHobbies = findViewById<Button>(R.id.hobbies)
        ButtonHobbies.setOnClickListener {
            val intent = Intent (this, Hobbies ::class.java)
            startActivity(intent)
        }
        val ButtonEducation = findViewById<Button>(R.id.education)
        ButtonEducation.setOnClickListener {
            val intent = Intent (this, Education ::class.java)
            startActivity(intent)
        }
        val ButtonAchiements = findViewById<Button>(R.id.achiements)
        ButtonAchiements.setOnClickListener {
            val intent = Intent (this, Achievements ::class.java)
            startActivity(intent)
        }

    }


}