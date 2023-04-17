package com.example.noteappretrofit.models

import com.example.noteappretrofit.models.User

data class UserResponse(
    val token: String,
    val user: User
)