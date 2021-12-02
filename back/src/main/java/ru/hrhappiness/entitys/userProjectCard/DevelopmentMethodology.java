
package ru.hrhappiness.entitys.userProjectCard;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class DevelopmentMethodology {

    @Id
    private String developmentMethodologyName;
}
