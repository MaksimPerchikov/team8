package ru.hrhappiness.entitys;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductDevelopment {
    @Id
    @GeneratedValue
    private Integer id;

    private String productDevelopment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductDevelopment() {
        return productDevelopment;
    }

    public void setProductDevelopment(String productDevelopment) {
        this.productDevelopment = productDevelopment;
    }
}