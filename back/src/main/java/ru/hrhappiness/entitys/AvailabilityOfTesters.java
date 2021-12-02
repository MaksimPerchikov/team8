package ru.hrhappiness.entitys;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AvailabilityOfTesters{
    @Id
    @GeneratedValue
    private Integer id;
    private String availabilityOfTesters;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvailabilityOfTesters() {
        return availabilityOfTesters;
    }

    public void setAvailabilityOfTesters(String availabilityOfTesters) {
        this.availabilityOfTesters = availabilityOfTesters;
    }
}