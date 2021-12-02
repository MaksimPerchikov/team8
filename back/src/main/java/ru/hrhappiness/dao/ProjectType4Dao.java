/*
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.ProjectType2;
import ru.hrhappiness.entitys.ProjectType4;
import ru.hrhappiness.repository.ProjectType2Repository;
import ru.hrhappiness.repository.ProjectType4Repository;

import java.util.List;

@Service
public class ProjectType4Dao {
    private final ProjectType4Repository projectType4Repository;

    @Autowired
    public ProjectType4Dao(ProjectType4Repository projectType4Repository) {
        this.projectType4Repository = projectType4Repository;
    }
    public void create(ProjectType4 projectType4){
        projectType4Repository.save(projectType4);
    }
    public void deleteAll(){
        projectType4Repository.deleteAll();
    }

    public List<ProjectType4> findAll(){
        return projectType4Repository.findAll();
    }
}

*/
