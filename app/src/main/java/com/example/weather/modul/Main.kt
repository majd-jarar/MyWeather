package com.example.weather.modul

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Main(val temp: Double,val feelsLike: Double,val tempMin: Double,val tempMax: Double,val pressure: Int
,val humidity: Int)