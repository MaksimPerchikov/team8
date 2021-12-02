package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.customers.Customer;
import ru.hrhappiness.repository.customers.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerDao {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerDao(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Object findAll(){
        return customerRepository.findAll();
    }

    public Optional<Customer> findByIdCustomer(Long id){
        return customerRepository.findById(id);
    }
    public void deleteCustomer(){
        customerRepository.deleteAll();
    }
}
