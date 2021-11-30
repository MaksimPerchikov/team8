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
public class IsTestersOnProject {
    @Id
    @GeneratedValue
    private Integer id;
    private String isTestersOnProject;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvailabilityOfTesters() {
        return isTestersOnProject;
    }

    public void setAvailabilityOfTesters(String availabilityOfTesters) {
        this.isTestersOnProject = availabilityOfTesters;
    }
}