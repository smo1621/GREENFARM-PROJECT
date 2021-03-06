package com.greenfarm.utils

import com.greenfarm.ApplicationClass.Companion.X_ACCESS_TOKEN
import com.greenfarm.ApplicationClass.Companion.mSharedPreferences


// Save
fun saveJwt(jwtToken: String) {
    val editor = mSharedPreferences.edit()
    editor.putString(X_ACCESS_TOKEN, jwtToken)

    editor.apply()
}

fun saveUserId(userId: String){
    val editor = mSharedPreferences.edit()
    editor.putString("userId", userId)

    editor.apply()
}


// Get
fun getJwt(): String? = mSharedPreferences.getString(X_ACCESS_TOKEN, null)

fun getUserId(): String? = mSharedPreferences.getString("userId", null)