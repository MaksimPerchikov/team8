package ru.hrhappiness.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import ru.hrhappiness.dao.CustomersListDao;
import ru.hrhappiness.entitys.customers.Customer;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hrhappines/customers_list")
@Api(value = "Customers",description = "crud customers")
public class CustomersRestController {

    private final CustomersListDao customersListDao;

    public CustomersRestController(CustomersListDao customersListDao) {
        this.customersListDao = customersListDao;
    }

    @PostMapping
    @ApiOperation(value = "create customer", response = Customer.class)
    public Customer createCustomer(@RequestBody Customer customer){
        return customersListDao.createCustomer(customer);
    }

    //вывод всех доступных НАЗВАНИЙ компаний (Наименований заказчиков)
    @ApiOperation(value = "show name customer.Only one cell - customerName!",response = List.class)
    @GetMapping
    public List<String> findAllCustomersListNameCompany(){
        return customersListDao.findAllCustomersNameCompany();
    }

    //Все заказчики, полные их данные
    @GetMapping("/all")
    @ApiOperation(value = "find all customers, all parameters",response = List.class)
    public List<Customer> findAllCustomers(){
     return customersListDao.findAllCustomersWhichAreInDb();
    }

    //пока не используется
    @GetMapping(value = "{id}")
    public Optional<Customer> findById(@PathVariable ("id") Long id){
        return customersListDao.findByIdCustomer(id);
    }

    //пока не используется
    @DeleteMapping
    public void deleteCustomers(){
        customersListDao.deleteCustomer();
    }
}

