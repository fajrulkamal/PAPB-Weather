package com.example.weatherapp_dataflair.data

import com.example.weatherapp_dataflair.data.models.CurrentWeather
import com.google.android.gms.common.api.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("weather?")
    suspend fun getCurrentWeather(
        @Query("q") city:String,
        @Query("units") units:String,
        @Query("appid") apiKey:String,
    ):retrofit2.Response<CurrentWeather>
}