package ru.hrhappiness.entitys;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StageProject {

    @Id
    @GeneratedValue
    private Integer id;

    private String stageProject;

    public Integer getStageProject_id() {
        return id;
    }

    public void setStageProject_id(Integer stageProject_id) {
        this.id = stageProject_id;
    }

    public String getStageProject() {
        return stageProject;
    }

    public void setStageProject(String stageProject) {
        this.stageProject = stageProject;
    }

    @Override
    public String toString() {
        return "StageProject{" +
                "stageProject_id=" + id +
                ", stageProject='" + stageProject + '\'' +
                '}';
    }
}