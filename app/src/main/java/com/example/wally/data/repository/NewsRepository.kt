package com.example.wally.data.repository

import com.example.wally.data.api.ApiHelper

class NewsRepository (private val apiHelper: ApiHelper) {

    suspend fun getAllNewsSources(apiKey: String) = apiHelper.getAllNewsSources(apiKey = apiKey)

    suspend fun getNewsFromSources(source: String, apiKey: String) = apiHelper.getNewsFromSources(source = source, apiKey = apiKey)
}