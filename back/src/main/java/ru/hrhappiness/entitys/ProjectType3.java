package ru.hrhappiness.entitys;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProjectType3 {

    @Id
    private String projectType3Name;
}
