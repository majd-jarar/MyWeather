package com.example.weather.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.weather.BuildConfig
import com.example.weather.R
import com.example.weather.databinding.ActivityWeatherBinding
import com.example.weather.modul.Data
import com.example.weather.network.ApiManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherActivity : AppCompatActivity() {

    lateinit var binding : ActivityWeatherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        binding = ActivityWeatherBinding.inflate(layoutInflater)
        val cityname = findViewById<TextView>(R.id.tv_city_name)
        val tempreture = findViewById<TextView>(R.id.tv_temp)
        var edsearh = findViewById<EditText>(R.id.cityNameEditText)
        val tmpmin = findViewById<TextView>(R.id.tv_tmp_min)
        val tmpmax = findViewById<TextView>(R.id.tv_tmp_max)
        val speedofwind = findViewById<TextView>(R.id.tv_wind_speed)
        val imgsearch:ImageView=findViewById<ImageView>(R.id.img_search)
       Log.e("hhh","kkkk")
        val cloud = findViewById<TextView>(R.id.tv_cloud)

        val apikey:String?="c97a5f6d2aae53ef832376eb07ccae11"
       imgsearch.setOnClickListener(View.OnClickListener {
           var nameofcitys:String?= edsearh.getText().toString()

           val URL = BuildConfig.My_CLOUD_API

           val retrofit = Retrofit.Builder()
                   .baseUrl(URL)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build()
           val api: ApiManager = retrofit.create(ApiManager::class.java)
           val call = api.getWeather(nameofcitys,apikey)
           var item = call.enqueue(object : Callback<Data> {
               override fun onFailure(call: Call<Data>, t: Throwable) {
                   Toast.makeText(this@WeatherActivity, "failer connect", Toast.LENGTH_SHORT).show()

               }

               override fun onResponse(call: Call<Data>, response: Response<Data>) {
                   var allData: Data? = response.body()
                   if (allData != null) {
Log.e("kkkk",allData.toString())
                       cityname.setText(allData.name)
                       cityname.setVisibility(View.VISIBLE)
                       tempreture.setText(allData.main.temp.toString())
                       tmpmin.setText(allData.main.tempMin.toString())
                       tmpmax.setText(allData.main.tempMax.toString())
                       speedofwind.setText(allData.wind.speed.toString())
                       cloud.setText(allData.clouds.all.toString())

                   }
                   Log.e("hhhhh", allData.toString())
               }
           })


       })

    }


}

