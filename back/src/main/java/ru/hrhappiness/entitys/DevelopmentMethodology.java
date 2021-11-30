package ru.hrhappiness.entitys;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DevelopmentMethodology {
    @Id
    @GeneratedValue
    private Integer id;

    private String developmentMethodology;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevelopmentMethodology() {
        return developmentMethodology;
    }

    public void setDevelopmentMethodology(String developmentMethodology) {
        this.developmentMethodology = developmentMethodology;
    }

}