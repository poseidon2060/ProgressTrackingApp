package com.example.progresstrackingapp.data.retrofit

import com.example.progresstrackingapp.data.model.Quote
import retrofit2.Call
import retrofit2.http.GET

interface QuoteApiService {

    @GET("v1/quotes?category=success")
    fun getRandomQuote(): Call<List<Quote>>

}