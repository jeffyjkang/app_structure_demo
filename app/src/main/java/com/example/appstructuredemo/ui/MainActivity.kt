package com.example.appstructuredemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appstructuredemo.util.*
import android.widget.TextView
import com.example.appstructuredemo.R
import com.example.appstructuredemo.application.StructureApplication
import com.example.appstructuredemo.model.Order

class MainActivity : AppCompatActivity() {
//    lateinit var discountView: TextView
    lateinit var priceView: TextView
    lateinit var taxView: TextView
    lateinit var orderDateView: TextView
    lateinit var customerFirstNameView: TextView
    lateinit var customerLastNameView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Order Details"
        displayOrderDetails((application as StructureApplication).order)
    }

    private fun displayOrderDetails(order: Order) {
//        discountView = this.findViewById(R.id.orderDate)
        val discountView = findViewById<TextView>(R.id.discount)
        discountView.text = formatPercent(order.discount)
        priceView = this.findViewById(R.id.price)
        priceView.text = formatCurrency(order.price)
        taxView = this.findViewById(R.id.tax)
        taxView.text = formatCurrency(order.tax)
        orderDateView = this.findViewById(R.id.orderDate)
        orderDateView.text = formatDate(order.orderDate)
        customerFirstNameView = this.findViewById(R.id.customerFirstName)
        customerLastNameView = this.findViewById(R.id.customerLastName)
        customerFirstNameView.text = formatCustomerName(order.customerFirstName, order.customerLastName)
    }
}