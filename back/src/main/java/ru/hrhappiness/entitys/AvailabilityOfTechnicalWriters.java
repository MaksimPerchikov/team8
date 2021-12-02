package ru.hrhappiness.entitys;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AvailabilityOfTechnicalWriters {

    @Id
    @GeneratedValue
    private Integer id;

    private String availOfTechnicalWriters;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvailabilityOfTechnicalWriters() {
        return availOfTechnicalWriters;
    }

    public void setAvailabilityOfTechnicalWriters(String availabilityOfTechnicalWriters) {
        this.availOfTechnicalWriters = availabilityOfTechnicalWriters;
    }

}