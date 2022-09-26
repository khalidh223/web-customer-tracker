package com.demo.wct.service

import com.demo.wct.entities.CustomerEntity
import com.demo.wct.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
open class CustomerServiceImpl(@Autowired private val customerRepository: CustomerRepository) : CustomerService {

    override fun getCustomers(): List<CustomerEntity> {
        return customerRepository.findAll()
    }

//    @Transactional
//    override fun saveCustomer(customerEntity: CustomerEntity) {
//        customerRepository.saveCustomer(customerEntity)
//    }
//
//    @Transactional
//    override fun getCustomerById(customerId: Long): CustomerEntity {
//        return customerRepository.getCustomerById(customerId)
//    }
//
//    @Transactional
//    override fun deleteCustomer(customerId: Long) {
//        return customerRepository.deleteCustomer(customerId)
//    }
//
//    @Transactional
//    override fun searchCustomers(theSearchName: String): List<CustomerEntity> {
//        return customerRepository.searchCustomers(theSearchName)
//    }
}