package ru.hrhappiness.entitys.myTest;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Sur {

    @Id
    @GeneratedValue
    private Long id;

    private String surname;
}
