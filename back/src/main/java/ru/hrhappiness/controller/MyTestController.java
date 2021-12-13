package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.MyTestDao;
import ru.hrhappiness.entitys.myTest.MyTestNameClass;

import ru.hrhappiness.entitys.myTest.SurAfterName;

import java.util.List;
//мой контроллер для экспериментов
@RestController
@RequestMapping("/myt")
public class MyTestController {


    private final MyTestDao  myTestDao;
    @Autowired
    public MyTestController(MyTestDao myTestDao) {
        this.myTestDao = myTestDao;
    }

    @PostMapping
    public MyTestNameClass createMyTest(@RequestBody MyTestNameClass myTestNameClass){
        return myTestDao.createMyTest(myTestNameClass);
    }

    @GetMapping
    public List<MyTestNameClass> findAllMyTest(){
        return myTestDao.findAll();
    }

    @DeleteMapping
    public void deleteMyTest(){
        myTestDao.deleteAllMyTest();
    }


    //Sur
    @PostMapping(value = "/sur")
    public SurAfterName createSur(@RequestBody SurAfterName surAfterName){
        return myTestDao.createSur(surAfterName);
    }
    @GetMapping(value = "/sur")
    public List<SurAfterName> findAllSur(){
        return myTestDao.findAllSur();
    }


}
