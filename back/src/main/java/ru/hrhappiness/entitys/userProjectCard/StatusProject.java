package ru.hrhappiness.entitys.userProjectCard;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class StatusProject {

    @Id
    private Integer id;

    private String statusProjectName;

    public StatusProject(Integer id, String statusProjectName) {
        this.id = id;
        this.statusProjectName = statusProjectName;
    }

    public StatusProject() {
    }
}
