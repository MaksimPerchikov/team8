package ru.hrhappiness.entitys.userProjectCard;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class IsTechnicalWritersOnProject {

    @Id
    private Long id;

    private String isTechnicalWritersOnProjectName;

}
