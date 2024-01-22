package org.jspiders.customerapi.repository;

import org.jspiders.customerapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {



    //returns the list of all customers having specific name
    List<Customer>findByCustomerName(String name);

    //returns the customer details based on specific email id
    Customer findByCustomerEmail(String email);

    //returns the list of customer having age greater than specific value
    List<Customer> findByCustomerAgeGreaterThan(int age);

    //returns the list of customer having purchase amt less than specific value.
    List<Customer> findByTotalPurchaseLessThan(double amt);

    //returns the list of customer having name=? and age=?
    List<Customer>findByCustomerNameAndCustomerAge(String name, int age);

    //returns the list of customer having age between ? and ?
    List<Customer>findByCustomerAgeBetween(int a1, int a2);
}


