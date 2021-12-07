package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.MyTestDao;
import ru.hrhappiness.entitys.myTest.MyTest;

import java.util.List;

@RestController
@RequestMapping("/myt")
public class MyTestController {


    private final MyTestDao  myTestDao;
    @Autowired
    public MyTestController(MyTestDao myTestDao) {
        this.myTestDao = myTestDao;
    }

    @PostMapping
    public MyTest createMyTest(@RequestBody MyTest myTest){
        return myTestDao.createMyTest(myTest);
    }

    @GetMapping
    public List<MyTest> findAllMyTest(){
        return myTestDao.findAll();
    }

    @DeleteMapping
    public void deleteMyTest(){
        myTestDao.deleteAllMyTest();
    }
}
