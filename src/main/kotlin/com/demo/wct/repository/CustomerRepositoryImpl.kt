package com.demo.wct.repository

import com.demo.wct.entities.CustomerEntity
import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
open class CustomerRepositoryImpl(
    @Autowired private val sessionFactory: SessionFactory
) : CustomerRepository {

    @Transactional
    override fun getCustomers(): List<CustomerEntity> {

        // get the current hibernate session
        val currentSession = sessionFactory.currentSession
        // create a query
        val theQuery = currentSession.createQuery("FROM CustomerEntity", CustomerEntity::class.java)
        // execute query and get result list & return results
        return theQuery.resultList
    }

}