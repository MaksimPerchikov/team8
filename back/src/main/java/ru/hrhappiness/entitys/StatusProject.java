package ru.hrhappiness.entitys;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StatusProject {
    @Id
    private String statusProjectName;
}
