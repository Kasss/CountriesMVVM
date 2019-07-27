package kz.devkitchen.countriesmvvm.model

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("name")
    val countryName: String?,
    @SerializedName("capital")
    val capitalName: String?,
    @SerializedName("flagPNG")
    val flag: String?)