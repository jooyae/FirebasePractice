package org.sopt.firebasepractice


data class ResponseFirebaseToken(
    @SerializedName("message")
    val message : String,
    @SerializedName("status")
    val status : Int,
    @SerializedName("success")
    val success : Boolean
) {
    annotation class SerializedName(val value: String)
}
