package ru.hrhappiness.controller;

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

       /* if (userProjectCard.getProjectTypeBooleanFirstCell().getId().equals(1)){
           userProjectCard.getProjectTypeBooleanFirstCell().setName();
            userProjectCardDao.createUserProjectCard(userProjectCard);
        }else if(userProjectCard.getProjectTypeBooleanFirstCell().getId().equals(1)){
*/
          //  userProjectCard.getProjectTypeBooleanFirstCell().setTAndM(false);
            userProjectCardDao.createUserProjectCard(userProjectCard);


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



    @GetMapping(value = "/t")
    public String test(){
        return userProjectCardDao.testMethod();
    }


}