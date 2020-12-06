package com.example.weather.network

import com.example.weather.modul.Data
import retrofit2.Call
import retrofit2.http.*

interface ApiManager {
    @GET("weather")
    fun getWeather (@Query("q")q:String?, @Query("appid")appid:String?):Call<Data>

//    @GET(WebAddressConstants.URLARTICAL)
//    fun postLogin(
//            @Query("country") country: String?,
//            @Query("category") category: String?,
//            @Query("apiKey") apiKey: String?): ErrorHandlingAdapter.MyCall<Data?>?
}