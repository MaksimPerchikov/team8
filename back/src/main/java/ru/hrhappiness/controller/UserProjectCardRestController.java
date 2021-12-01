package ru.hrhappiness.controller;

import ch.qos.logback.core.hook.DelayingShutdownHook;
import jdk.nashorn.internal.runtime.Context;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.UserProjectCardDao;

import ru.hrhappiness.entitys.UserProjectCard;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hrhappines")
public class UserProjectCardRestController {

    private final UserProjectCardDao userProjectCardDao;
    UserProjectCard userProjectCard;

    @Autowired
    public UserProjectCardRestController(UserProjectCardDao userProjectCardDao){
        this.userProjectCardDao = userProjectCardDao;
    }

    @PostMapping
    public void createUserCard(@RequestBody UserProjectCard userProjectCard){

        if(userProjectCard.getStatus().equals("В работе")){
            userProjectCard.setStatus("В работе");
        }else if(userProjectCard.getStatus().equals("Чернивок")){
            userProjectCard.setStatus("Чернивок");
        }else if(userProjectCard.getStatus().equals("Архив")){
            userProjectCard.setStatus("Архив");
        }else userProjectCard.setStatus("Error");


        if (userProjectCard.getProjectType1().equals("Fix")){
            userProjectCard.setProjectType1("Fix");
        }else if(userProjectCard.getProjectType1().equals("T&M")) {
            userProjectCard.setProjectType1("T&M");
        }else userProjectCard.setProjectType1("Error");


        if(userProjectCard.getProjectType2().equals("ПО")){
            userProjectCard.setProjectType2("ПО");
        }else if(userProjectCard.getProjectType2().equals("ПАК")){
            userProjectCard.setProjectType2("ПАК");
        }else userProjectCard.setProjectType2("Error");


        if(userProjectCard.getProjectType3().equals("MVP")){
            userProjectCard.setProjectType3("MVP");
        }else if(userProjectCard.getProjectType3().equals("не MVP")){
            userProjectCard.setProjectType3("не MVP");
        }else userProjectCard.setProjectType3("Error");

        if(userProjectCard.getProjectType4().equals("Новый")){
            userProjectCard.setProjectType4("Новый");
        }else if(userProjectCard.getProjectType4().equals("Модернизированный")){
            userProjectCard.setProjectType4("Модернизированный");
        }else userProjectCard.setProjectType1("Error");


        if(userProjectCard.getStageProject().equals("Инициация")){
            userProjectCard.setStageProject("Инициация");
        }
         else if( userProjectCard.getStageProject().equals("Начало")){
            userProjectCard.setStageProject("Начало");
        }
        else if( userProjectCard.getStageProject().equals("Середина")){
            userProjectCard.setStageProject("Середина");
        }
        else if(userProjectCard.getStageProject().equals("Завершающая")) {
            userProjectCard.setStageProject("Завершающая");
        }else userProjectCard.setStageProject("Error");


        if(userProjectCard.getDevelopmentMethodology().equals("Agile")){
            userProjectCard.setDevelopmentMethodology("Agile");
        }else if(userProjectCard.getDevelopmentMethodology().equals("WaterFall")){
            userProjectCard.setDevelopmentMethodology("WaterFall");
        }else userProjectCard.setDevelopmentMethodology("Error");


        if(userProjectCard.getProductDevelopment().equals("Да")){
            userProjectCard.setDevelopmentMethodology("Да");
        }else if(userProjectCard.getProductDevelopment().equals("Нет")){
            userProjectCard.setDevelopmentMethodology("Нет");
        } else userProjectCard.setProductDevelopment("Error");

        if(userProjectCard.getIsTestersOnProject().equals("Да")){
            userProjectCard.setIsTestersOnProject("Да");
        }else if(userProjectCard.getIsTestersOnProject().equals("Нет")){
            userProjectCard.setIsTestersOnProject("Нет");
        }else userProjectCard.setIsTestersOnProject("Error");

        if(userProjectCard.getIsTechnicalWritersOnProject().equals("Да")){
            userProjectCard.setIsTechnicalWritersOnProject("Да");
        }else if(userProjectCard.getIsTechnicalWritersOnProject().equals("Нет")) {
            userProjectCard.setIsTechnicalWritersOnProject("Нет");
        }else userProjectCard.setIsTechnicalWritersOnProject("ERROR");

        userProjectCardDao.createUserProjectCard(userProjectCard);

       // userProjectCardDao.createUserProjectCard(userProjectCard);


        //условие,чтобы не создавать карточку при незаполненных полях
        /*if(userProjectCard.getId()!=null &&
        userProjectCard.getDeadlineProject()!=null &&
        userProjectCard.getTypeProjectFirstCell()!=null &&
        userProjectCard.getNameProject() !=null &&
        userProjectCard.getNameCustomer() !=null &&
        userProjectCard.getTypeProjectFourthCell() !=null &&
        userProjectCard.getTypeProjectThirdCell() !=null &&
        userProjectCard.getTypeProjectFirstCell() !=null &&
        userProjectCard.getTypeProjectSecondCell()!=null &&
        userProjectCard.getFunctionDirection()!=null &&
        userProjectCard.getSubjectArea()!=null &&
        userProjectCard.getProjectDescription()!=null &&
        userProjectCard.getTasksToBeSolvedOnTheProject()!=null &&
        userProjectCard.getStageProject()!=null &&
        userProjectCard.getDeadlineProject()!=null &&
        userProjectCard.getTechnology()!=null &&
        userProjectCard.getNumberOfStakeholders()!=null &&
        userProjectCard.getDevelopmentMethodology()!=null &&
        userProjectCard.getAnalystTester()!=null &&
        userProjectCard.getLocation()!=null &&
        userProjectCard.getWorkSchedule()!=null &&
        userProjectCard.getReleaseDateOfPeopleOnTheProject()!=null &&
        userProjectCard.getOvertime()!=null){
            userProjectCardDao.createUserProjectCard(userProjectCard);
        }*/


    }

    /*@PostMapping(value = "/update/{id}")
    public void updateUserProjectCArdById(@PathVariable Integer id,
                                                               @RequestBody UserProjectCard userProjectCard){
    userProjectCardDao.update(userProjectCard,id);
    }*/


    //найти Карточку пользователя по Айди
    @GetMapping(value = "{id}",consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<UserProjectCard> findById(@PathVariable("id")Integer id){
        if(id == null){
            new ResponseEntity<UserProjectCard>(HttpStatus.BAD_REQUEST);
        }
        return userProjectCardDao.findById(id);
    }

    //вывести все карточки пользователей
    @GetMapping
    public List<UserProjectCard> findAllUsersCards(){
        return userProjectCardDao.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteUserCardProjectById(@PathVariable Integer id){
        //дописать ИФ,если айди не найден
        userProjectCardDao.deleteById(id);
    }
    @DeleteMapping
    public void deleteUserCardProjectAll(){
        userProjectCardDao.deleteAll();
    }



    @GetMapping(value = "/t")
    public String test(){
        return userProjectCardDao.testMethod();
    }


}