package com.demo.wct.service

import com.demo.wct.entities.CustomerEntity

interface CustomerService {
    fun getCustomers() : List<CustomerEntity>
}