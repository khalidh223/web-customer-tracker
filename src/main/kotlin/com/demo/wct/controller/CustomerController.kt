package com.demo.wct.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/customers")
class CustomerController {

    @RequestMapping("/list")
    fun listCustomers(theModel: Model): String {
        return "list-customers"
    }
}