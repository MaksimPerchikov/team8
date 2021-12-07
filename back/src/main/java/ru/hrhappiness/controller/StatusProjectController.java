
package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.StatusProjectDao;
import ru.hrhappiness.entitys.userProjectCard.StatusProject;


import java.util.List;

@RestController
@RequestMapping("/susp")
public class StatusProjectController {

    private final StatusProjectDao statusProjectDao;

    @Autowired
    public StatusProjectController(StatusProjectDao statusProjectDao) {
        this.statusProjectDao = statusProjectDao;
    }

    @PostMapping
    public void createProjectType4(@RequestBody StatusProject statusProject){
        statusProjectDao.create(statusProject);
    }
    @GetMapping
    public List<StatusProject> findAllProjectType4(){
        return statusProjectDao.findAll();
    }
    @DeleteMapping
    public void deleteProjectType4(){
        statusProjectDao.deleteAll();
    }
}

