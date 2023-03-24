package com.ewbugs.implicitintentskotlin


data class AccountInformation(

    val userName: String,
    val email: String,
    val phoneNumber: String,
    val password: String,
    val exposedDropDownMenu: String
    //val exposedDropDownMenu: Boolean,
    //val selectedValue: String

) : java.io.Serializable {

   //function expressions:

   fun getGender() = if (exposedDropDownMenu.isEmpty()) "Specified Gender: N/A" else "Specified Gender: $exposedDropDownMenu"

}



