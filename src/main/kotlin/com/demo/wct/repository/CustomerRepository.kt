package com.demo.wct.repository

import com.demo.wct.entities.CustomerEntity

interface CustomerRepository {
    fun getCustomers() : List<CustomerEntity>
    fun saveCustomer(customerEntity: CustomerEntity)
    fun getCustomerById(customerId: Long): CustomerEntity
    fun deleteCustomer(customerId: Long)
}