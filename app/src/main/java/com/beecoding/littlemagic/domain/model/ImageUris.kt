package com.beecoding.littlemagic.domain.model

import com.google.gson.annotations.SerializedName

data class ImageUris(
    @SerializedName("art_crop")
    val artCrop: String,
    @SerializedName("border_crop")
    val borderCrop: String,
    val large: String,
    val normal: String,
    val png: String,
    val small: String
)
