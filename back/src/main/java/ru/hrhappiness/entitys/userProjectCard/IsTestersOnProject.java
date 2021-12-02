package ru.hrhappiness.entitys.userProjectCard;

import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;

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
public class IsTestersOnProject {

    @Id
    private Long id;

    private String isTestersOnProjectName;


}
