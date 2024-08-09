package com.example.smarthomecontroller

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {
    val lightStatus = MutableLiveData<String>("Light: Off")
    val thermostatStatus = MutableLiveData<String>("Thermostat: 20°C")

    fun updateLightStatus(isOn: Boolean) {
        lightStatus.value = if (isOn) "Light: On" else "Light: Off"
    }

    fun updateThermostatStatus(temperature: Int) {
        thermostatStatus.value = "Thermostat: ${temperature}°C"
    }
}