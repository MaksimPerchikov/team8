/*
package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ru.hrhappiness.dao.ProjectType1Dao;
import ru.hrhappiness.entitys.ProjectType1;

import javax.annotation.security.PermitAll;
import java.util.List;

@RestController
@RequestMapping("/pt1")
public class ProjectType1Controller{

    private final ProjectType1Dao projectType1Dao;

    @Autowired
    public ProjectType1Controller(ProjectType1Dao projectType1Dao) {
        this.projectType1Dao = projectType1Dao;
    }

    @PostMapping
    public void createProjectType1(@RequestBody ProjectType1 projectType1){
        projectType1Dao.create(projectType1);
    }
    @GetMapping
    public List<ProjectType1> findAllProjectType1(){
        return projectType1Dao.findAll();
    }
    @DeleteMapping
    public void deleteProjectType1(){
        projectType1Dao.deleteAll();
    }
}
*/
