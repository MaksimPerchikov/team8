/*
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.ProjectType2;
import ru.hrhappiness.entitys.ProjectType3;
import ru.hrhappiness.repository.ProjectType2Repository;
import ru.hrhappiness.repository.ProjectType3Repository;

import java.util.List;

@Service
public class ProjectType3Dao {
    private final ProjectType3Repository projectType3Repository;

    @Autowired
    public ProjectType3Dao(ProjectType3Repository projectType3Repository) {
        this.projectType3Repository = projectType3Repository;
    }
    public void create(ProjectType3 projectType3){
        projectType3Repository.save(projectType3);
    }
    public void deleteAll(){
        projectType3Repository.deleteAll();
    }

    public List<ProjectType3> findAll(){
        return projectType3Repository.findAll();
    }
}

*/
