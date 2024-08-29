package com.example.rating

import android.os.Bundle
import android.widget.SeekBar
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
import com.example.rating.ui.theme.RatingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Use the XML layout

        val seek = findViewById<SeekBar>(R.id.myseek)
        seek?.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    // Custom code
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                    // On seek touch
                }

                override fun onStopTrackingTouch(s: SeekBar?) {
                    val output = "Progress is ${s?.progress}%"
                    Toast.makeText(this@MainActivity, output, Toast.LENGTH_LONG).show()
                }
            }
        )
    }
}