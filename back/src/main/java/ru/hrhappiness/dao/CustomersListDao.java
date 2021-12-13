
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.customers.Customer;
import ru.hrhappiness.entitys.userProjectCard.StatusProject;
import ru.hrhappiness.entitys.userProjectCard.UserProjectCard;
import ru.hrhappiness.repository.customers.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomersListDao {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomersListDao(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public List<Customer> findAllCustomersWhichAreInDb(){
       return customerRepository.findAll();
    }

    //localhost:8080/hrhappines/customers_list  // Вывод всех найденных в БД названий Компаний(то есть наименований заказчиков)
    public List<String> findAllCustomersNameCompany(){
     List<Customer> customerList = customerRepository.findAll();
        List<String> customersNameC = new ArrayList<>();
        for (Customer customer: customerList) {
            if(customer.getCompanyName() != null){
                customersNameC.add(customer.getCompanyName());

            }
        }
    return customersNameC;

    }

    public Optional<Customer> findByIdCustomer(Long id){
        List<Customer> customers = customerRepository.findAll();


        return customerRepository.findById(id);
    }
    public void deleteCustomer(){
        customerRepository.deleteAll();
    }
}
