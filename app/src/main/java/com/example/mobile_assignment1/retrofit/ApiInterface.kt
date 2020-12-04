package com.example.mobile_assignment1.retrofit

import com.example.mobile_assignment1.model.PostModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("posts")
    fun getPosts(): Call<List<PostModel>>
}