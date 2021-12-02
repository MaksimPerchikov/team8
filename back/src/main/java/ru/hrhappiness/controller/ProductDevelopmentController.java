/*
package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.DevelopmentMethodologyDao;
import ru.hrhappiness.dao.ProductDevelopmentDao;
import ru.hrhappiness.entitys.DevelopmentMethodology;
import ru.hrhappiness.entitys.ProductDevelopment;

import java.util.List;

@RestController
@RequestMapping("/pd")
public class ProductDevelopmentController {
    private final ProductDevelopmentDao productDevelopmentDao;

    @Autowired
    public ProductDevelopmentController(ProductDevelopmentDao productDevelopmentDao) {
        this.productDevelopmentDao = productDevelopmentDao;
    }

    @PostMapping
    public void createProductDevelopment(@RequestBody ProductDevelopment productDevelopment){
        productDevelopmentDao.create(productDevelopment);
    }
    @GetMapping
    public List<ProductDevelopment> findAllProductDevelopment(){
        return productDevelopmentDao.findAll();
    }
    @DeleteMapping
    public void deleteProductDevelopment(){
        productDevelopmentDao.deleteAll();
    }
}
*/
