package com.demo.wct.service

import com.demo.wct.entities.CustomerEntity

interface CustomerService {
    fun getCustomers() : List<CustomerEntity>
//    fun saveCustomer(customerEntity: CustomerEntity)
//    fun getCustomerById(customerId: Long) : CustomerEntity
//    fun deleteCustomer(customerId: Long)
//    fun searchCustomers(theSearchName: String) : List<CustomerEntity>
}