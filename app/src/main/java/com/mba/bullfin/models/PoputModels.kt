package com.mba.bullfin.models
import androidx.annotation.DrawableRes

data class PoputModels(
    var titulo: String,
    var contenido: String,
    @DrawableRes val imageResourceId: Int,
    var visible : Int,


)
