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
@Table(name = "MyTestNameClass")
public class MyTestNameClass {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private SurAfterName surAfterName;

    private String name;

}
