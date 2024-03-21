package com.beecoding.littlemagic.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ImageUrisDto(
    @SerializedName("art_crop")
    val artCrop: String,
    @SerializedName("border_crop")
    val borderCrop: String,
    val large: String,
    val normal: String,
    val png: String,
    val small: String
)