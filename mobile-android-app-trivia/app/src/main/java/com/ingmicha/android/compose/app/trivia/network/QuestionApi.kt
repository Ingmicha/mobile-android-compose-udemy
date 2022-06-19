package com.ingmicha.android.compose.app.trivia.network

import com.ingmicha.android.compose.app.trivia.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {

    @GET("world.json")
    suspend fun getAllQuestions(): Question
}