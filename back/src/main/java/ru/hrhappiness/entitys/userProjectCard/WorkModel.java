package ru.hrhappiness.entitys.userProjectCard;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

@Getter
@Setter
@ToString
public class WorkModel {

    @Id
    private Long id;

    private String workModelName;


    public WorkModel(Long id, String workModelName) {
        this.id = id;
        this.workModelName = workModelName;
    }
    public WorkModel(){}
}
