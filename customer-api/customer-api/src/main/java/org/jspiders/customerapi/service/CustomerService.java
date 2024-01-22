package org.jspiders.customerapi.service;


import org.jspiders.customerapi.model.Customer;
import org.jspiders.customerapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;


@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public void addCustomer(Customer c){
        repository.save(c);
    }

    //get all customers
    public List<Customer>getAllCustomers(){
        return repository.findAll();
    }

    //get customer by id
    public Customer getCustomerById(int id){
        return repository.findById(id).orElse(null);
    }

    //get customer by name
    public List<Customer>getCustomerByName(String name){
        return repository.findByCustomerName(name);
    }

    // get customer by email
    public Customer getCustomerByEMail(String email){
        return repository.findByCustomerEmail(email);
    }

    //get customer having age greater than ?(user value)
       Scanner sc=new Scanner(System.in);
    public List<Customer>getCustomerAge(int age1){
        age1=sc.nextInt();
        return repository.findByCustomerAgeGreaterThan(age1);
    }

    //get customer having purchase less than ? (user value)
    public List<Customer>getCustomerByTotalPurchase(double amt){
        amt=sc.nextDouble();
        return repository.findByTotalPurchaseLessThan(amt);
    }
}
