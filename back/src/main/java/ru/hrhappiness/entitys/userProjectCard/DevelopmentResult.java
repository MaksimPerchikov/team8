package ru.hrhappiness.entitys.userProjectCard;

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
public class DevelopmentResult {

    @Id
    private Long id;

    private String developmentResultName;
}

