package dev.itjunior.y2s4mobileappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.skills)
        buttonSkills.setOnClickListener {
            val intent = Intent (this, Skills ::class.java)
            startActivity(intent)
        }
        val buttonHobbies = findViewById<Button>(R.id.hobbies)
        buttonHobbies.setOnClickListener {
            val intent = Intent (this, Hobbies ::class.java)
            startActivity(intent)
        }
        val buttonEducation = findViewById<Button>(R.id.education)
        buttonEducation.setOnClickListener {
            val intent = Intent (this, Education ::class.java)
            startActivity(intent)
        }
        val buttonAchievements = findViewById<Button>(R.id.achievements)
        buttonAchievements.setOnClickListener {
            val intent = Intent (this, Achievements ::class.java)
            startActivity(intent)
        }

    }


}