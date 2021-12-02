/*
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.ProjectType1;
import ru.hrhappiness.repository.ProjectType1Repository;

import java.util.List;
@Service
public class ProjectType1Dao {
    private final ProjectType1Repository projectType1Repository;

    @Autowired
    public ProjectType1Dao(ProjectType1Repository projectType1Repository) {
        this.projectType1Repository = projectType1Repository;
    }
    public void create(ProjectType1 projectType1){
        projectType1Repository.save(projectType1);
    }
    public void deleteAll(){
        projectType1Repository.deleteAll();
    }

    public List<ProjectType1> findAll(){
        return projectType1Repository.findAll();
    }
}

*/
