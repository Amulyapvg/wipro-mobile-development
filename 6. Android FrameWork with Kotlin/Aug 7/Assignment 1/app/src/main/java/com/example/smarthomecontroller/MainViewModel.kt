package com.example.smarthomecontroller

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val lightOn = MutableLiveData<Boolean>(false)
    val temperature = MutableLiveData<Int>(20)

    fun toggleLight() {
        viewModelScope.launch {
            lightOn.value = lightOn.value?.not()
            Apiservice.toggleLight(lightOn.value ?: false)
        }
    }

    fun setTemperature(temp: Int) {
        viewModelScope.launch {
            temperature.value = temp
            Apiservice.setTemperature(temp)
        }
    }
}