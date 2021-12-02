package ru.hrhappiness.entitys.userProjectCard;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Overtime {
    @Id
    private Long id;

    private String overtimeName;
}
