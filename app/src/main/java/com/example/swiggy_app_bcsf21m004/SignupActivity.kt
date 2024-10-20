package com.example.swiggy_app_bcsf21m004

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        // Reference to EditText fields
        val usernameEditText: EditText = findViewById(R.id.username)
        val emailEditText: EditText = findViewById(R.id.email)
        val addressEditText: EditText = findViewById(R.id.address)
        val passwordEditText: EditText = findViewById(R.id.password)
        val phoneNumberEditText: EditText = findViewById(R.id.phoneNumber)

        // Reference to Signup Button
        val signupButton: Button = findViewById(R.id.signupButton)

        // Handle signup button click
        signupButton.setOnClickListener {
            // Get the user input
            val username = usernameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            val address = addressEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
            val phoneNumber = phoneNumberEditText.text.toString().trim()

            // Validate inputs
            if (username.isEmpty() || email.isEmpty() || address.isEmpty() || password.isEmpty() || phoneNumber.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Proceed with signup and navigate to HomeActivity
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish() // Close SignupActivity
            }
        }
    }
}
