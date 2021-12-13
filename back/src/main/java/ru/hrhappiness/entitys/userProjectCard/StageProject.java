package ru.hrhappiness.entitys.userProjectCard;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StageProject {

    @Id
    private Long id;

    private String stageProjectName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStageProjectName() {
        return stageProjectName;
    }

    public void setStageProjectName(String stageProjectName) {
        this.stageProjectName = stageProjectName;
    }

}
