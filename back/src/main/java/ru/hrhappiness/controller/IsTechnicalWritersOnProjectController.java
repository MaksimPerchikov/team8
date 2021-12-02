/*
package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.IsTechnicalWritersOnProjectDao;
import ru.hrhappiness.dao.IsTestersOnProjectDao;
import ru.hrhappiness.entitys.IsTechnicalWritersOnProject;
import ru.hrhappiness.entitys.IsTestersOnProject;

import java.util.List;

@RestController
@RequestMapping("/itwop")
public class IsTechnicalWritersOnProjectController {

    private final IsTechnicalWritersOnProjectDao isTechnicalWritersOnProjectDao;

    @Autowired
    public IsTechnicalWritersOnProjectController(IsTechnicalWritersOnProjectDao isTechnicalWritersOnProjectDao) {
        this.isTechnicalWritersOnProjectDao = isTechnicalWritersOnProjectDao;
    }

    @PostMapping
    public void createIsTechnicalWritersOnProject(@RequestBody IsTechnicalWritersOnProject isTechnicalWritersOnProject){
        isTechnicalWritersOnProjectDao.create(isTechnicalWritersOnProject);
    }
    @GetMapping
    public List<IsTechnicalWritersOnProject> findAllIsTechnicalWritersOnProject(){
        return isTechnicalWritersOnProjectDao.findAll();
    }
    @DeleteMapping
    public void deleteIsTestersOnProjectDao(){
        isTechnicalWritersOnProjectDao.deleteAll();
    }
}
*/
