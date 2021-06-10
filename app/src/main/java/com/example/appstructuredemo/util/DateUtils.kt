package com.example.appstructuredemo.util

import java.text.SimpleDateFormat
import java.util.*

fun formatDate(date: Date): String {
    val format = SimpleDateFormat("dd/MM/yyy")
    return format.format(date)
}