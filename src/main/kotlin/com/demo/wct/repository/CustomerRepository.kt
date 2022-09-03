package com.demo.wct.repository

import com.demo.wct.entities.CustomerEntity

interface CustomerRepository {
    fun getCustomers() : List<CustomerEntity>
}