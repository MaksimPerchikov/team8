
package ru.hrhappiness.entitys.customers;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String companyName;

    private String nameResponsiblePerson;
    private String surnameResponsiblePerson;
    private String patronymicResponsiblePerson;
    private Long numberPhoneResponsiblePerson;
    private String emailResponsiblePerson;
}

