package com.taetae98.gachonqr.dto.request

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("USER_ID")
    val id: String = "",
    @SerializedName("PWD")
    val password: String = "",
) {
    val fsp_cmd = "login"
    val DVIC_ID = "dwFraM1pVhl6mMn4npgL2dtZw7pZxw2lo2uqpm1yuMs="
    val fsp_action = "UserAction"
    val APPS_ID = "com.sz.Atwee.gachon"
}