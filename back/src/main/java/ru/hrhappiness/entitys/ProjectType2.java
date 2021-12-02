package ru.hrhappiness.entitys;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProjectType2 {

    @Id
    private String projectType2Name;
}
