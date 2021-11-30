package ru.hrhappiness.entitys;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ProjectTypeBooleanFirstCell {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
   /* private Boolean Fix *//*= true*//*;
    private Boolean TAndM *//*= false*//*;*/

    /*private Boolean PO = false;
    private Boolean PAK = true;
    private Boolean MVP = true;
    private Boolean NotMVP = false;
    private Boolean New =false;
    private Boolean Modernisation = true;*/
}
