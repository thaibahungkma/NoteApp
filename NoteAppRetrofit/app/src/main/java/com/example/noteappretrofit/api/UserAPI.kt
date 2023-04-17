package com.example.noteappretrofit.api

import com.example.noteappretrofit.models.UserRequest
import com.example.noteappretrofit.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {

    @POST("/users/signup")
    suspend fun signUp(@Body userRequest: UserRequest) : Response<UserResponse>

    @POST("/users/signIn")
    suspend fun signIn(@Body userRequest: UserRequest) : Response<UserResponse>
}