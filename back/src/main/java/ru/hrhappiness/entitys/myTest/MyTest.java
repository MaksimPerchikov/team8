package ru.hrhappiness.entitys.myTest;

import lombok.*;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MyTest{
    @Id
    @GeneratedValue
    private Long id;


    @OneToOne
    @JoinColumn(name = "sur_surname")
    private Sur sur;

    private String name;

}
