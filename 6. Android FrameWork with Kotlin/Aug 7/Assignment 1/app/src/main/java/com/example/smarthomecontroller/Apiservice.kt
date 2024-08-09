package com.example.smarthomecontroller

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST("light")
    suspend fun toggleLight(@Query("on") on: Boolean)

    @POST("temperature")
    suspend fun setTemperature(@Query("temp") temp: Int)

    companion object {
        private const val BASE_URL = "https://api.smarthome.com/"

        private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: ApiService = retrofit.create(ApiService::class.java)

        suspend fun toggleLight(on: Boolean) = service.toggleLight(on)
        suspend fun setTemperature(temp: Int) = service.setTemperature(temp)
    }
}