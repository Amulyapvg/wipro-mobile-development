package com.example.kotlindemo

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlindemo.ui.theme.KotlindemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val buttonWelcome: Button = findViewById(R.id.buttonWelcome)

        buttonWelcome.setOnClickListener {
            Toast.makeText(this, "Hello, Welcome Amulya", Toast.LENGTH_SHORT).show()
        }
    }
}