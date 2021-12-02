/*
package ru.hrhappiness.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.CustomerDao;
import ru.hrhappiness.entitys.customers.Customer;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hrhappines/customers")
public class CustomersRestController {

    private final CustomerDao customerDao;

    public CustomersRestController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerDao.createCustomer(customer);
    }
    @GetMapping
    public Object findAllCustomers(){
        return customerDao.findAll();
    }
    @GetMapping(value = "{id}")
    public Optional<Customer> findById(@PathVariable ("id") Long id){
        return customerDao.findByIdCustomer(id);
    }
    @DeleteMapping
    public void deleteCustomers(){
        customerDao.deleteCustomer();
    }
}
*/
