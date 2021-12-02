package ru.hrhappiness.entitys.userProjectCard;

import lombok.*;
//import ru.hrhappiness.entitys.customers.Customer;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Optional;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserProjectCard {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        private String projectName;

        private String customerName;

        private String status; //сделал

        private String projectType1;//сделал
        private String projectType2;//сделал
        private String projectType3;//сделал
        private String projectType4;//сделал

        private String functionalDirection;
        private String subjectArea;
        private String projectDescription;
        private String projectTasks;

        private String stageProject;//сделал

        private LocalDateTime projectEndDate;
        private String technologies;
        private String stakeholdersQuantity;

        private String developmentMethodology;//сделал

        private String productDevelopment;//сделал

        private Integer analyticsQuantity;
        private Integer developersQuantity;

        private String isTestersOnProject;//сделал

        private String isTechnicalWritersOnProject;//сделал

        private Integer membersQuantity;

        private String location;//сделал

        private String address;
        private LocalDateTime dateOfReleasePeopleOnProject;

        private String overtimes;//сделал

        private String isDocumentationOnProject;
        private String isGOST;
        private String procedureForBringingPeopleToProject;
        private String workTimeStart;
        private String workTimeEnd;

}

       /*



        */


/*
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String projectName;
        @OneToOne
        @JoinColumn(name = "status_status_project_name")
        private StatusProject status;


        @OneToOne
        @JoinColumn(name = "customer_name_id")
        private Customer customerName;



    @OneToOne
    @JoinColumn(name = "project_type_1_projectType1Name")
    private ProjectType1 projectType1;

    @OneToOne
    @JoinColumn(name = "project_type_2_projectType1Name")
    private ProjectType2 projectType2;

    @OneToOne
    @JoinColumn(name = "project_type_3_projectType1Name")
    private ProjectType3 projectType3;

    @OneToOne
    @JoinColumn(name = "project_type_4_projectType1Name")
    private ProjectType4 projectType4;

    private String functionalDirection;

    private String subjectArea;

    private String projectDescription;

    private String projectTasks;

    @OneToOne
    @JoinColumn(name = "stage_project_stageProjectName")
    private StageProject stageProject;

    private LocalDateTime projectEndDate;

    private String technologies;
    private String stakeholdersQuantity;


    @OneToOne
    @JoinColumn(name = "development_methodology_developmentMethodologyName")
    private DevelopmentMethodology developmentMethodology;


    @OneToOne
    @JoinColumn(name = "product_development_productDevelopmentName")
    private ProductDevelopment productDevelopment;



    private Integer analyticsQuantity;
    private Integer developersQuantity;


    @OneToOne
    @JoinColumn(name = "is_testers_on_project_isTestersOnProjectName")
    private IsTestersOnProject isTestersOnProject;

    @OneToOne
    @JoinColumn(name = "is_technical_writers_on_project_isTechWritsOnProName")
    private IsTechnicalWritersOnProject isTechnicalWritersOnProject;

    private Integer membersQuantity;
    @OneToOne
    @JoinColumn(name = "location_locationName")
    private Location location;
    private String address;


    private LocalDateTime dateOfReleasePeopleOnProject;
    @OneToOne
    @JoinColumn(name = "overtimes_overtimesName")
    private Overtime overtimes;
    private String isDocumentationOnProject;
    private String isGOST;
    private String procedureForBringingPeopleToProject;
    private String workTimeStart;
    private String workTimeEnd;
   }
*/
