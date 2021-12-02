/*
package ru.hrhappiness.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.DevelopmentMethodology;
import ru.hrhappiness.entitys.ProductDevelopment;
import ru.hrhappiness.repository.DevelopmentMethodologyRepository;
import ru.hrhappiness.repository.ProductDevelopmentRepository;

import java.util.List;
@Service
public class ProductDevelopmentDao {
    private final ProductDevelopmentRepository productDevelopmentRepository;

    @Autowired
    public ProductDevelopmentDao(ProductDevelopmentRepository productDevelopmentRepository) {
        this.productDevelopmentRepository = productDevelopmentRepository;
    }

    public void create(ProductDevelopment productDevelopment){
        productDevelopmentRepository.save(productDevelopment);
    }
    public void deleteAll(){
        productDevelopmentRepository.deleteAll();
    }

    public List<ProductDevelopment> findAll(){
        return productDevelopmentRepository.findAll();
    }
}*/
