package ru.hrhappiness.entitys;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER_UserProjectCardDaoDraft")
public class UserProjectCardDraft {
        @Id
        @GeneratedValue
        private Integer id;
        private Boolean archive = false;
        private String nameCustomer;
        private String nameProject;

        @OneToOne(cascade = CascadeType.ALL)
        private TypeProjectFirstCell typeProjectFirstCell;

        @OneToOne(cascade = CascadeType.ALL)
        private TypeProjectSecondCell typeProjectSecondCell;

        @OneToOne(cascade = CascadeType.ALL)
        private TypeProjectThirdCell typeProjectThirdCell;

        @OneToOne(cascade = CascadeType.ALL)
        private TypeProjectFourthCell typeProjectFourthCell;

        private String functionDirection;

        private String subjectArea;

        private String projectDescription;

        private String tasksToBeSolvedOnTheProject;

        @OneToOne
        private StageProject stageProject;

        private LocalDateTime deadlineProject;

        private String technology;
        private Integer numberOfStakeholders;

        @OneToOne
        DevelopmentMethodology developmentMethodology;

        @OneToOne
        ProductDevelopment productDevelopment;

        private Integer analystTester;

        @OneToOne
        private AvailabilityOfTesters availabilityOfTesters;

        @OneToOne
        private AvailabilityOfTechnicalWriters availabilityOfTechnicalWriters;

        private Integer numbersPeopleInTheTeam;
        private String location;
        private LocalDateTime workSchedule;
        private LocalDateTime releaseDateOfPeopleOnTheProject;
        private Integer overtime;
        private Boolean availabilityOfDocumentsIntTheProject;

        @Override
        public String toString() {
                return "UserProjectCardDaoDraft{" +
                        "id=" + id +
                        ", archive=" + archive +
                        ", nameCustomer='" + nameCustomer + '\'' +
                        ", nameProject='" + nameProject + '\'' +
                        ", typeProjectFirstCell=" + typeProjectFirstCell +
                        ", typeProjectSecondCell=" + typeProjectSecondCell +
                        ", typeProjectThirdCell=" + typeProjectThirdCell +
                        ", typeProjectFourthCell=" + typeProjectFourthCell +
                        ", functionDirection='" + functionDirection + '\'' +
                        ", subjectArea='" + subjectArea + '\'' +
                        ", projectDescription='" + projectDescription + '\'' +
                        ", tasksToBeSolvedOnTheProject='" + tasksToBeSolvedOnTheProject + '\'' +
                        ", stageProject=" + stageProject +
                        ", deadlineProject=" + deadlineProject +
                        ", technology='" + technology + '\'' +
                        ", numberOfStakeholders=" + numberOfStakeholders +
                        ", developmentMethodology=" + developmentMethodology +
                        ", productDevelopment=" + productDevelopment +
                        ", analystTester=" + analystTester +
                        ", availabilityOfTesters=" + availabilityOfTesters +
                        ", availabilityOfTechnicalWriters=" + availabilityOfTechnicalWriters +
                        ", numbersPeopleInTheTeam=" + numbersPeopleInTheTeam +
                        ", location='" + location + '\'' +
                        ", workSchedule=" + workSchedule +
                        ", releaseDateOfPeopleOnTheProject=" + releaseDateOfPeopleOnTheProject +
                        ", overtime=" + overtime +
                        ", availabilityOfDocumentsIntTheProject=" + availabilityOfDocumentsIntTheProject +
                        '}';
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public Boolean getArchive() {
                return archive;
        }

        public void setArchive(Boolean archive) {
                this.archive = archive;
        }

        public String getNameCustomer() {
                return nameCustomer;
        }

        public void setNameCustomer(String nameCustomer) {
                this.nameCustomer = nameCustomer;
        }

        public String getNameProject() {
                return nameProject;
        }

        public void setNameProject(String nameProject) {
                this.nameProject = nameProject;
        }

        public TypeProjectFirstCell getTypeProjectFirstCell() {
                return typeProjectFirstCell;
        }

        public void setTypeProjectFirstCell(TypeProjectFirstCell typeProjectFirstCell) {
                this.typeProjectFirstCell = typeProjectFirstCell;
        }

        public TypeProjectSecondCell getTypeProjectSecondCell() {
                return typeProjectSecondCell;
        }

        public void setTypeProjectSecondCell(TypeProjectSecondCell typeProjectSecondCell) {
                this.typeProjectSecondCell = typeProjectSecondCell;
        }

        public TypeProjectThirdCell getTypeProjectThirdCell() {
                return typeProjectThirdCell;
        }

        public void setTypeProjectThirdCell(TypeProjectThirdCell typeProjectThirdCell) {
                this.typeProjectThirdCell = typeProjectThirdCell;
        }

        public TypeProjectFourthCell getTypeProjectFourthCell() {
                return typeProjectFourthCell;
        }

        public void setTypeProjectFourthCell(TypeProjectFourthCell typeProjectFourthCell) {
                this.typeProjectFourthCell = typeProjectFourthCell;
        }

        public String getFunctionDirection() {
                return functionDirection;
        }

        public void setFunctionDirection(String functionDirection) {
                this.functionDirection = functionDirection;
        }

        public String getSubjectArea() {
                return subjectArea;
        }

        public void setSubjectArea(String subjectArea) {
                this.subjectArea = subjectArea;
        }

        public String getProjectDescription() {
                return projectDescription;
        }

        public void setProjectDescription(String projectDescription) {
                this.projectDescription = projectDescription;
        }

        public String getTasksToBeSolvedOnTheProject() {
                return tasksToBeSolvedOnTheProject;
        }

        public void setTasksToBeSolvedOnTheProject(String tasksToBeSolvedOnTheProject) {
                this.tasksToBeSolvedOnTheProject = tasksToBeSolvedOnTheProject;
        }

        public StageProject getStageProject() {
                return stageProject;
        }

        public void setStageProject(StageProject stageProject) {
                this.stageProject = stageProject;
        }

        public LocalDateTime getDeadlineProject() {
                return deadlineProject;
        }

        public void setDeadlineProject(LocalDateTime deadlineProject) {
                this.deadlineProject = deadlineProject;
        }

        public String getTechnology() {
                return technology;
        }

        public void setTechnology(String technology) {
                this.technology = technology;
        }

        public Integer getNumberOfStakeholders() {
                return numberOfStakeholders;
        }

        public void setNumberOfStakeholders(Integer numberOfStakeholders) {
                this.numberOfStakeholders = numberOfStakeholders;
        }

        public DevelopmentMethodology getDevelopmentMethodology() {
                return developmentMethodology;
        }

        public void setDevelopmentMethodology(DevelopmentMethodology developmentMethodology) {
                this.developmentMethodology = developmentMethodology;
        }

        public ProductDevelopment getProductDevelopment() {
                return productDevelopment;
        }

        public void setProductDevelopment(ProductDevelopment productDevelopment) {
                this.productDevelopment = productDevelopment;
        }

        public Integer getAnalystTester() {
                return analystTester;
        }

        public void setAnalystTester(Integer analystTester) {
                this.analystTester = analystTester;
        }

        public AvailabilityOfTesters getAvailabilityOfTesters() {
                return availabilityOfTesters;
        }

        public void setAvailabilityOfTesters(AvailabilityOfTesters availabilityOfTesters) {
                this.availabilityOfTesters = availabilityOfTesters;
        }

        public AvailabilityOfTechnicalWriters getAvailabilityOfTechnicalWriters() {
                return availabilityOfTechnicalWriters;
        }

        public void setAvailabilityOfTechnicalWriters(AvailabilityOfTechnicalWriters availabilityOfTechnicalWriters) {
                this.availabilityOfTechnicalWriters = availabilityOfTechnicalWriters;
        }

        public Integer getNumbersPeopleInTheTeam() {
                return numbersPeopleInTheTeam;
        }

        public void setNumbersPeopleInTheTeam(Integer numbersPeopleInTheTeam) {
                this.numbersPeopleInTheTeam = numbersPeopleInTheTeam;
        }

        public String getLocation() {
                return location;
        }

        public void setLocation(String location) {
                this.location = location;
        }

        public LocalDateTime getWorkSchedule() {
                return workSchedule;
        }

        public void setWorkSchedule(LocalDateTime workSchedule) {
                this.workSchedule = workSchedule;
        }

        public LocalDateTime getReleaseDateOfPeopleOnTheProject() {
                return releaseDateOfPeopleOnTheProject;
        }

        public void setReleaseDateOfPeopleOnTheProject(LocalDateTime releaseDateOfPeopleOnTheProject) {
                this.releaseDateOfPeopleOnTheProject = releaseDateOfPeopleOnTheProject;
        }

        public Integer getOvertime() {
                return overtime;
        }

        public void setOvertime(Integer overtime) {
                this.overtime = overtime;
        }

        public Boolean getAvailabilityOfDocumentsIntTheProject() {
                return availabilityOfDocumentsIntTheProject;
        }

        public void setAvailabilityOfDocumentsIntTheProject(Boolean availabilityOfDocumentsIntTheProject) {
                this.availabilityOfDocumentsIntTheProject = availabilityOfDocumentsIntTheProject;
        }
}
