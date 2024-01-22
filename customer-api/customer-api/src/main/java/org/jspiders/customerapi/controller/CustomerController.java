package org.jspiders.customerapi.controller;

import org.jspiders.customerapi.model.Customer;
import org.jspiders.customerapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

        @Autowired
        private CustomerService service;

        @PostMapping("/customers")
        public void addCustomer(@RequestBody Customer c){
            service.addCustomer(c);
        }

        @GetMapping("/allcustomers")
        public List<Customer>getAllCustomers(){
                return  service.getAllCustomers();
        }

        @GetMapping("/customersid")
        public Customer getCustomerById(@PathVariable(value = "id")int id){
               return service.getCustomerById(id);
        }

//        @GetMapping("/customersname")
//        public List<Customer> getCustomerByName(){
//                return service.getCustomerByName("customerName");
//        }
}
