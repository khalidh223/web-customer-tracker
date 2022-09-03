package com.demo.wct.service

import com.demo.wct.entities.CustomerEntity
import com.demo.wct.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
open class CustomerServiceImpl(@Autowired private val customerRepository: CustomerRepository) : CustomerService {

    @Transactional
    override fun getCustomers(): List<CustomerEntity> {
        return customerRepository.getCustomers()
    }
}