package com.example.noteappretrofit.repository

import android.util.Log
import com.example.noteappretrofit.api.UserAPI
import com.example.noteappretrofit.models.UserRequest
import com.example.noteappretrofit.utils.Constants.TAG
import javax.inject.Inject

class UserRepository @Inject constructor(private val userAPI: UserAPI) {

    suspend fun registerUser(userRequest: UserRequest) {
        val response = userAPI.signUp(userRequest)
        Log.d(TAG, response.body().toString())
    }

    suspend fun loginUser(userRequest: UserRequest) {
        val response = userAPI.signIn(userRequest)
        Log.d(TAG, response.body().toString())
    }
}