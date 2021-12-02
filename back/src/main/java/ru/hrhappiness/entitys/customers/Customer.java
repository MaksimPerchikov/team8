package ru.hrhappiness.entitys.customers;

import lombok.*;
import ru.hrhappiness.entitys.userProjectCard.SetNameProjects;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "company_name_name")
    private SetNameProjects companyName;

    private String nameResponsiblePerson;
    private String surnameResponsiblePerson;
    private String patronymicResponsiblePerson;
    private Long numberPhoneResponsiblePerson;
    private String emailResponsiblePerson;
}
