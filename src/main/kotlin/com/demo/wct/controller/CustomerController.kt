package com.demo.wct.controller

import com.demo.wct.entities.CustomerEntity
import com.demo.wct.repository.CustomerRepository
import com.demo.wct.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/customers")
class CustomerController(@Autowired private val customerService: CustomerService) {

    @GetMapping("/list")
    fun listCustomers(theModel: Model): String {

        // get customers from customerService
        val theCustomers = customerService.getCustomers()

        // add the customers to the model
        theModel.addAttribute("customers", theCustomers)

        return "list-customers"
    }

    @GetMapping("/addCustomerForm")
    fun addCustomerForm(theModel: Model) : String {

        // create model attribute to bind form data
        val theCustomer = CustomerEntity()

        theModel.addAttribute("customer", theCustomer)

        return "customer-form"
    }

    @GetMapping("/updateCustomerForm")
    fun updateCustomerForm(@RequestParam("customerId") customerId: Long, theModel: Model) : String {

        val theCustomer = customerService.getCustomerById(customerId)

        theModel.addAttribute("customer", theCustomer)

        return "customer-form"
    }

    @PostMapping("/saveCustomer")
    fun saveCustomer(@ModelAttribute("customer") theCustomerEntity: CustomerEntity) : String {

        customerService.saveCustomer(theCustomerEntity)

        return "redirect:/customers/list"
    }

    @GetMapping("/delete")
    fun deleteCustomer(@RequestParam("customerId") customerId: Long) : String {

        customerService.deleteCustomer(customerId)

        return "redirect:/customers/list"
    }

    @GetMapping("/search")
    fun searchCustomers(@RequestParam("theSearchName") theSearchName: String, theModel: Model) : String {

        val theCustomers = customerService.searchCustomers(theSearchName)

        theModel.addAttribute("customers", theCustomers)

        return "list-customers"
    }
}