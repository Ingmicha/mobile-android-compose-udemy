package com.ingmicha.android.compose.app.note.util

import java.text.SimpleDateFormat
import java.util.*

fun formatDate(time: Long): String {
    val date = Date(time)
    val format = SimpleDateFormat("EEE, d MM hh:hh aaa",Locale.getDefault())
    return format.format(date)
}