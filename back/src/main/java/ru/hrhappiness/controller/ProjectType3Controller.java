/*
package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.ProjectType2Dao;
import ru.hrhappiness.dao.ProjectType3Dao;
import ru.hrhappiness.entitys.ProjectType2;
import ru.hrhappiness.entitys.ProjectType3;

import java.util.List;

@RestController
@RequestMapping("/pt3")
public class ProjectType3Controller{

    private final ProjectType3Dao projectType3Dao;

    @Autowired
    public ProjectType3Controller(ProjectType3Dao projectType3Dao) {
        this.projectType3Dao = projectType3Dao;
    }

    @PostMapping
    public void createProjectType3(@RequestBody ProjectType3 projectType3){
        projectType3Dao.create(projectType3);
    }
    @GetMapping
    public List<ProjectType3> findAllProjectType3(){
        return projectType3Dao.findAll();
    }
    @DeleteMapping
    public void deleteProjectType3(){
        projectType3Dao.deleteAll();
    }
}*/
