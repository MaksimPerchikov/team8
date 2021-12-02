/*
package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.ProjectType2Dao;
import ru.hrhappiness.dao.ProjectType4Dao;
import ru.hrhappiness.entitys.ProjectType2;
import ru.hrhappiness.entitys.ProjectType4;

import java.util.List;

@RestController
@RequestMapping("/pt4")
public class ProjectType4Controller{

    private final ProjectType4Dao projectType4Dao;

    @Autowired
    public ProjectType4Controller(ProjectType4Dao projectType4Dao) {
        this.projectType4Dao = projectType4Dao;
    }

    @PostMapping
    public void createProjectType4(@RequestBody ProjectType4 projectType4){
        projectType4Dao.create(projectType4);
    }
    @GetMapping
    public List<ProjectType4> findAllProjectType4(){
        return projectType4Dao.findAll();
    }
    @DeleteMapping
    public void deleteProjectType4(){
        projectType4Dao.deleteAll();
    }
}*/
