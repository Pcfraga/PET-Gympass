package com.example.petgympass.network

import com.example.petgympass.model.JSON
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("endpoint/{id}")
    fun getData(@Path("id") id: Int): Call<JSON>
}
