package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.SetNameProjectsDao;
import ru.hrhappiness.entitys.userProjectCard.SetNameProjects;
import ru.hrhappiness.repository.SetNameProjectsRepository;

import java.util.List;

@RestController
@RequestMapping("/hrhappines/customers_list")
public class SetNameProjectDao {

    private final SetNameProjectsDao setNameProjectsDao;

    @Autowired
    public SetNameProjectDao(SetNameProjectsDao setNameProjectsDao) {
        this.setNameProjectsDao = setNameProjectsDao;
    }

    @GetMapping
    public List<SetNameProjects> findAll(){
        return setNameProjectsDao.findAllSNP();
    }
    @PostMapping
    public void createSetNameProject(@RequestBody SetNameProjects setNameProjects){
        setNameProjectsDao.createSNP(setNameProjects);
    }
    @DeleteMapping
    public void deleteSetNameProject(){
        setNameProjectsDao.deleteAllSNP();
    }
}
