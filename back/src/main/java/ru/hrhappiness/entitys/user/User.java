
package ru.hrhappiness.entitys.user;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "usr")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String password;
    private String surname;
    private String patronymic;
    private String post;
    private Integer numberPhone;
    private String email;
    private String loginInTelegram;

}

