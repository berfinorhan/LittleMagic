package com.beecoding.littlemagic.utils

import java.text.SimpleDateFormat

class Utils {
    companion object {
        fun String.toDateFormat(): String? {
            val originalFormat = SimpleDateFormat("yyyy-MM-dd")
            val newFormat = SimpleDateFormat("dd/MM/yyyy")
            val date = originalFormat.parse(this)

            return date?.let { newFormat.format(it) ?: "" }
        }

        fun String.capitalize(): String {
            return this.replaceFirstChar { this[0].uppercase() }
        }
    }

}
