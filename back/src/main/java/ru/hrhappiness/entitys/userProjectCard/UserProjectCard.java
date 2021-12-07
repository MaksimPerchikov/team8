package ru.hrhappiness.entitys.userProjectCard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
//import ru.hrhappiness.entitys.customers.Customer;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApiModel(value = "class UserProjectCard")
public class UserProjectCard {

        @Id
        @GeneratedValue
        @ApiModelProperty(value = "id of userProjectCard")
        private Integer id;// @JsonIgnore
    //не забыть сменить на ЛОНГ!!!!


        @NotNull
        @ApiModelProperty(value = "name of project ",example = "My project!")
        private String projectName;

        //забираю параметр из базы уже созданных заказчиков
        @NotNull
        @ApiModelProperty(value = "name of customer ",example = "NameCompany")
        private String customerName;

        @ApiModelProperty(value = "name of status ",example = "В работе")
        private String status; //сделал

        @ApiModelProperty(value = "name of work model ",example = "T&M")
        private String workModel;//сделал
        @ApiModelProperty(value = "name of development result  ",example = "ПАК")
        private String developmentResult;//сделал
        @ApiModelProperty(value = "name of product type ",example = "не MVP")
        private String productType;//сделал
        @ApiModelProperty(value = "name of project type ",example = "Новый")
        private String projectType;//сделал

        @NotNull
        @ApiModelProperty(value = "name of function direction ",example = "Test")
        private String functionalDirection;

        @ApiModelProperty(value = "name of subject area ",example = "Test subject")
        private String subjectArea;

        @NotNull
        @ApiModelProperty(value = "name of project description ",example = "TestProductDescription")
        private String projectDescription;

        @ApiModelProperty(value = "name of project tasks ",example = "TestName")
        private String projectTasks;

        @ApiModelProperty(value = "name of stage project ",example = "Начало")
        private String stageProject;//сделал

     // private LocalDateTime projectEndDate;
        @ApiModelProperty(value = "name of project end date ",example = "2021-11-30T14:45:29.000Z")
        private String projectEndDate;
        @ApiModelProperty(value = "name of technologies ",example = "Technologies test")
        private String technologies;
        @ApiModelProperty(value = "name of stakeholders Quantity ",example = "test stakeholders")
        private String stakeholdersQuantity;

        @ApiModelProperty(value = "name of development methodology  ",example = "Agile")
        private String developmentMethodology;//сделал
        @ApiModelProperty(value = "name of product development ",example = "Да")
        private String productDevelopment;//сделал

      //  private Integer analyticsQuantity;
      //  private Integer developersQuantity;
        @ApiModelProperty(value = "name of analytics quantity",example = "12")
        private String analyticsQuantity;
        @ApiModelProperty(value = "name of developers quantity",example = "13")
        private String developersQuantity;

        @ApiModelProperty(value = "name of testers on project",example = "Да")
        private String isTestersOnProject;//сделал
        @ApiModelProperty(value = "name of technical writers on project",example = "Нет")
        private String isTechnicalWritersOnProject;//сделал

       // private Integer membersQuantity;
        @ApiModelProperty(value = "name of members quantity",example = "12")
        private String membersQuantity;

        @ApiModelProperty(value = "name of location",example = "В офисе")
        private String location;//сделал

        @ApiModelProperty(value = "name of address",example = "Some address")
        private String address;
       // private LocalDateTime dateOfReleasePeopleOnProject;
        @ApiModelProperty(value = "name 'date of release people on the project'",example = "2021-11-30T14:46:08.000Z")
        private String dateOfReleasePeopleOnProject;

        @ApiModelProperty(value = "name of overtimes",example = "Постоянно")
        private String overtimes;//сделал

        @ApiModelProperty(value = "name of 'is documentation on project'",example = "Да")
        private String isDocumentationOnProject;//сделал

        @ApiModelProperty(value = "name of 'isGOST",example = "Test text")
        private String isGOST;

        @ApiModelProperty(value = "name of 'procedure for bringing people to project",example = "Test text")
        private String procedureForBringingPeopleToProject;
        // private Time workTimeStart;
        //private Time workTimeEnd;
        @ApiModelProperty(value = "name of work time start",example = "4:20")
        private String workTimeStart;

        @ApiModelProperty(value = "name of work time end",example = "4:21")
        private String workTimeEnd;

}


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
