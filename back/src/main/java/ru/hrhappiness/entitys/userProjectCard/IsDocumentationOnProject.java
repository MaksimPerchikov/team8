package ru.hrhappiness.entitys.userProjectCard;

import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class IsDocumentationOnProject {
    @Id
    @GeneratedValue
    private Long id;

    private String isDocumentationOnProjectName;
}
