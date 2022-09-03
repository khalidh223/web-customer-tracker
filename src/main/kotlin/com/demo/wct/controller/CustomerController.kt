package com.demo.wct.controller

import com.demo.wct.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/customers")
class CustomerController(@Autowired private val customerRepository: CustomerRepository) {

    @RequestMapping("/list")
    fun listCustomers(theModel: Model): String {

        // get customers from customerRepository
        val theCustomers = customerRepository.getCustomers()

        // add the customers to the model
        theModel.addAttribute("customers", theCustomers)

        return "list-customers"
    }
}