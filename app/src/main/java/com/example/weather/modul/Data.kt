package com.example.weather.modul

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(var coord: Coord,var weather: List<Weather>,var base: String,var main: Main,var visibility: Int
,var wind: Wind,var clouds: Clouds,var dt: Int,var syc: Syc, var timezone: Int,var id: Int,var name: String,var cod: Int)











//    private val coord: Coord? = null
//
//    @SerializedName("weather")
//    @Expose
//    private val weather: List<Weather>? = null

//    @SerializedName("base")
//    @Expose
//    private val base: String? = null
//
//    @SerializedName("main")
//    @Expose
//    private val main: Main? = null
//
//    @SerializedName("visibility")
//    @Expose
//    private val visibility: Int? = null
//
//    @SerializedName("wind")
//    @Expose
//    private val wind: Wind? = null
//
//    @SerializedName("clouds")
//    @Expose
//    private val clouds: Clouds? = null
//
//    @SerializedName("dt")
//    @Expose
//    private val dt: Int? = null
//
//    @SerializedName("sys")
//    @Expose
//    private val syc: Syc? = null
//
//    @SerializedName("timezone")
//    @Expose
//    private val timezone: Int? = null
//
//    @SerializedName("id")
//    @Expose
//    private val id: Int? = null
//
//    @SerializedName("name")
//    @Expose
//    private val name: String? = null
//
//    @SerializedName("cod")
//    @Expose
//    private val cod: Int? = null
