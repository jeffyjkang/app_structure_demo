package com.example.appstructuredemo.util

import java.text.NumberFormat

fun formatCustomerName(first: String, last: String): String {
    return "$first $last"
}

fun formatCurrency(price: Double): String {
    return NumberFormat.getCurrencyInstance().format(price)
}

fun formatPercent(discount: Double): String {
    return "${NumberFormat.getPercentInstance().format(discount)} discount"
}