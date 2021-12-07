package ru.hrhappiness.repository.customers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.customers.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
