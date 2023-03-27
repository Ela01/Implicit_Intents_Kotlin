package com.ewbugs.implicitintentskotlin



data class AccountInformation(

    val userName: String,
    val email: String,
    val phoneNumber: String,
    val password: String,
    val gender: String?,
    val checkBoxNA: Boolean


) : java.io.Serializable {
    
    //function expressions:

    fun ifEmpty() = if (checkBoxNA) "N/A"  else "$gender"



   //fun getGender() = selectedValue.ifEmpty { "N/A" }

}



