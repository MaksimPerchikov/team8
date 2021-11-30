package ru.hrhappiness.entitys;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class UserProjectCard {
        @Id
        @GeneratedValue
        private Integer id;
        private String status;
        private String customerName;
        private String projectName;

    @OneToOne(cascade = CascadeType.ALL)
    private ProjectTypeBooleanFirstCell projectTypeBooleanFirstCell;

    /*@OneToOne(cascade = CascadeType.ALL)
    private TypeProjectFirstCell typeProjectFirstCell;

    @OneToOne(cascade = CascadeType.ALL)
    private TypeProjectSecondCell typeProjectSecondCell;

    @OneToOne(cascade = CascadeType.ALL)
    private TypeProjectThirdCell typeProjectThirdCell;

    @OneToOne(cascade = CascadeType.ALL)
    private TypeProjectFourthCell typeProjectFourthCell;*/

    private String functionalDirection;

    private String subjectArea;

    private String projectDescription;

    private String projectTasks;

    @OneToOne(cascade = CascadeType.ALL)
    private StageProject projectStage;

    private LocalDateTime projectEndDate;

    private String technologies;
    private Integer stakeholdersQuantity;

    @OneToOne(cascade = CascadeType.ALL)
    DevelopmentMethodology developmentMethodology;

    @OneToOne(cascade = CascadeType.ALL)
    ProductDevelopment productDevelopment;

    private Integer analyticsQuantity;
    private Integer developersQuantity;


    @OneToOne(cascade = CascadeType.ALL)
    private IsTestersOnProject isTestersOnProject;

    @OneToOne(cascade = CascadeType.ALL)
    private IsTechnicalWritersOnProject isTechnicalWritersOnProject;

    private Integer membersQuantity;
    private String location;
    private String address;


    private LocalDateTime dateOfReleasePeopleOnProject;
    private String overtime;
    private String isDocumentationOnProject;
    private String isGOST;
    private String procedureForBringingPeopleToProject;
    private String workTimeStart;
    private String workTimeEnd;


}