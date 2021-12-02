/*
package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.ProjectType1Dao;
import ru.hrhappiness.dao.StageProjectDao;
import ru.hrhappiness.entitys.ProjectType1;
import ru.hrhappiness.entitys.StageProject;

import java.util.List;

@RestController
@RequestMapping("/sp")
public class StageProjectController {
    private final StageProjectDao stageProjectDao;
    @Autowired
    public StageProjectController(StageProjectDao stageProjectDao) {
        this.stageProjectDao = stageProjectDao;
    }

    @PostMapping
    public void createStageProject(@RequestBody StageProject stageProject){
        stageProjectDao.create(stageProject);
    }
    @GetMapping
    public List<StageProject> findAllStageProject(){
        return stageProjectDao.findAll();
    }
    @DeleteMapping
    public void deleteStageProject(){
        stageProjectDao.deleteAll();
    }
}
*/
