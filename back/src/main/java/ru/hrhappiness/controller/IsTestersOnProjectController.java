/*
package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.DevelopmentMethodologyDao;
import ru.hrhappiness.dao.IsTestersOnProjectDao;
import ru.hrhappiness.entitys.DevelopmentMethodology;
import ru.hrhappiness.entitys.IsTestersOnProject;

import java.util.List;

@RestController
@RequestMapping("/iton")
public class IsTestersOnProjectController {

    private final IsTestersOnProjectDao isTestersOnProjectDao;

    @Autowired
    public IsTestersOnProjectController(IsTestersOnProjectDao isTestersOnProjectDao) {
        this.isTestersOnProjectDao = isTestersOnProjectDao;
    }

    @PostMapping
    public void createIsTestersOnProjectDao(@RequestBody IsTestersOnProject isTestersOnProject){
        isTestersOnProjectDao.create(isTestersOnProject);
    }
    @GetMapping
    public List<IsTestersOnProject> findAllIsTestersOnProjectDao(){
        return isTestersOnProjectDao.findAll();
    }
    @DeleteMapping
    public void deleteIsTestersOnProjectDao(){
        isTestersOnProjectDao.deleteAll();
    }
}
*/
