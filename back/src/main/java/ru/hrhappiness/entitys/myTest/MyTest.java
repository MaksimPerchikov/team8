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
public class MyTest extends HashMap<String,String> {
    @Id
    @GeneratedValue
    private Long id;

  //  @JoinColumn
   // @OneToOne
   // private Sur sur;

    private String name;
}
