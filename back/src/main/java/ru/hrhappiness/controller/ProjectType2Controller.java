/*
package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.ProjectType1Dao;
import ru.hrhappiness.dao.ProjectType2Dao;
import ru.hrhappiness.entitys.ProjectType1;
import ru.hrhappiness.entitys.ProjectType2;

import java.util.List;

@RestController
@RequestMapping("/pt2")
public class ProjectType2Controller{

    private final ProjectType2Dao projectType2Dao;

    @Autowired
    public ProjectType2Controller(ProjectType2Dao projectType2Dao) {
        this.projectType2Dao = projectType2Dao;
    }

    @PostMapping
    public void createProjectType2(@RequestBody ProjectType2 projectType2){
        projectType2Dao.create(projectType2);
    }
    @GetMapping
    public List<ProjectType2> findAllProjectType2(){
        return projectType2Dao.findAll();
    }
    @DeleteMapping
    public void deleteProjectType2(){
        projectType2Dao.deleteAll();
    }
}*/
