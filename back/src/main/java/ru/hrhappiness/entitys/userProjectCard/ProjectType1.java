package ru.hrhappiness.entitys.userProjectCard;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProjectType1 {

    @Id
    private String projectType1Name;


}
