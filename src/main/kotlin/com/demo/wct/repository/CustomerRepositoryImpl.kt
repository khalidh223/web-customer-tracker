package com.demo.wct.repository

import com.demo.wct.entities.CustomerEntity
import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
open class CustomerRepositoryImpl(
    @Autowired private val sessionFactory: SessionFactory
) : CustomerRepository {

    override fun getCustomers(): List<CustomerEntity> {
        // get the current hibernate session
        val currentSession = sessionFactory.currentSession
        // create a query
        val theQuery = currentSession.createQuery("FROM CustomerEntity ORDER BY lastName", CustomerEntity::class.java)
        // execute query and get result list & return results
        return theQuery.resultList
    }

    override fun saveCustomer(customerEntity: CustomerEntity) {
        val currentSession = sessionFactory.currentSession

        currentSession.saveOrUpdate(customerEntity)
    }

    override fun getCustomerById(customerId: Long): CustomerEntity {
        val currentSession = sessionFactory.currentSession

        return currentSession.get(CustomerEntity::class.java, customerId)
    }

    override fun deleteCustomer(customerId: Long) {
        val currentSession = sessionFactory.currentSession

        val theQuery = currentSession.createQuery("DELETE from CustomerEntity where id=:customerId")

        theQuery.setParameter("customerId", customerId)

        theQuery.executeUpdate()
    }

}