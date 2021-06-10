package com.example.appstructuredemo.model

import java.util.*

class Order(
    val orderDate: Date = Date(),
    val price: Double = 123.25,
    val tax: Double = price * .085,
    val discount: Double = .10,
    val customerFirstName: String = "Lambda",
    val customerLastName: String = "Student"
)