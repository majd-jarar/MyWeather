package com.example.weather.modul

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Syc(val type: Int,val id: Int,val country: String,val sunrise: Int,val sunset: Int)