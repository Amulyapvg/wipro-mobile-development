package com.example.smarthomecontroller

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Switch
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
import com.example.smarthomecontroller.ui.theme.SmartHomeControllerTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchLights = findViewById<Switch>(R.id.switchLights)
        val switchThermostat = findViewById<Switch>(R.id.switchThermostat)

        switchLights.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Handle light switch ON
                Toast.makeText(this, "Lights ON", Toast.LENGTH_SHORT).show()
                // Add more logic here to control the lights
            } else {
                // Handle light switch OFF
                Toast.makeText(this, "Lights OFF", Toast.LENGTH_SHORT).show()
                // Add more logic here to control the lights
            }
        }

        switchThermostat.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Handle thermostat switch ON
                Toast.makeText(this, "Thermostat ON", Toast.LENGTH_SHORT).show()
                // Add more logic here to control the thermostat
            } else {
                // Handle thermostat switch OFF
                Toast.makeText(this, "Thermostat OFF", Toast.LENGTH_SHORT).show()
                // Add more logic here to control the thermostat
            }
        }
    }
}