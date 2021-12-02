/*
package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.DevelopmentMethodologyDao;
import ru.hrhappiness.entitys.DevelopmentMethodology;
import ru.hrhappiness.entitys.ProjectType1;

import java.util.List;

@RestController
@RequestMapping("/dm")
public class DevelopmentMethodologyController {

    private final DevelopmentMethodologyDao developmentMethodologyDao;

    @Autowired
    public DevelopmentMethodologyController(DevelopmentMethodologyDao developmentMethodologyDao) {
        this.developmentMethodologyDao = developmentMethodologyDao;
    }

    @PostMapping
    public void createDevelopmentMethodology(@RequestBody DevelopmentMethodology developmentMethodology){
        developmentMethodologyDao.create(developmentMethodology);
    }
    @GetMapping
    public List<DevelopmentMethodology> findAllDevelopmentMethodology(){
        return developmentMethodologyDao.findAll();
    }
    @DeleteMapping
    public void deleteDevelopmentMethodology(){
        developmentMethodologyDao.deleteAll();
    }
}
*/
