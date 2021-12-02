/*
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.ProjectType1;
import ru.hrhappiness.entitys.ProjectType2;
import ru.hrhappiness.repository.ProjectType1Repository;
import ru.hrhappiness.repository.ProjectType2Repository;

import java.util.List;

@Service
public class ProjectType2Dao {
    private final ProjectType2Repository projectType2Repository;

    @Autowired
    public ProjectType2Dao(ProjectType2Repository projectType2Repository) {
        this.projectType2Repository = projectType2Repository;
    }
    public void create(ProjectType2 projectType2){
        projectType2Repository.save(projectType2);
    }
    public void deleteAll(){
        projectType2Repository.deleteAll();
    }

    public List<ProjectType2> findAll(){
        return projectType2Repository.findAll();
    }
}

*/
