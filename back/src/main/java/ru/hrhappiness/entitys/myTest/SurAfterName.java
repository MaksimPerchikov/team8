package ru.hrhappiness.entitys.myTest;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "SurAfterName")
public class SurAfterName {

    @Id
    private String surname;
}
