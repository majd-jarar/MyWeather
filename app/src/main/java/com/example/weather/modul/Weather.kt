package com.example.weather.modul

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Weather (val id: Int,val main: String,val description: String,val icon: String)