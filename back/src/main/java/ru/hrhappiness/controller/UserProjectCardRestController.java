package ru.hrhappiness.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.UserProjectCardDao;

/*import ru.hrhappiness.entitys.userProjectCard.ProjectType1;*/
import ru.hrhappiness.entitys.user.User;
import ru.hrhappiness.entitys.userProjectCard.UserProjectCard;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hrhappiness")
@Api(value = "userProjectCard",description = "crud operations")
public class UserProjectCardRestController {

    private final UserProjectCardDao userProjectCardDao;
    UserProjectCard userProjectCard;

    @Autowired
    public UserProjectCardRestController(UserProjectCardDao userProjectCardDao) {
        this.userProjectCardDao = userProjectCardDao;

    }

    //приветствие
    @GetMapping(value = "/hi")
    public HashMap<String,String> hi(){
        HashMap<String,String> map = new HashMap<>();
        map.put("it's","ok");
        return map;
    }

    //создание карточки пользователя
    @PostMapping(value = "/create")
    @ApiOperation(value = "create userProjectCard")
    public void createUserCard(@RequestBody UserProjectCard userProjectCard) {
        userProjectCardDao.createUserProjectCard(userProjectCard);
    }


    //найти Карточку пользователя по Айди
    @ApiOperation(value = "show userProjectCard by id", response = Optional.class)
    @GetMapping(value = "/search/{id}", consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<UserProjectCard> findById(@PathVariable("id") Integer id) {
        if (id == null) {
            new ResponseEntity<UserProjectCard>(HttpStatus.BAD_REQUEST);
        }
        return userProjectCardDao.findById(id);
    }

    //вывести все карточки пользователей
    @GetMapping(value = "/all")
    @ApiOperation(value = "show all userProjectCards", response = List.class)
    public List<UserProjectCard> findAllUsersCards() {
        return userProjectCardDao.findAll();
    }

    //удалить карточку по id
    @DeleteMapping("/{id}")
    @ApiOperation(value = "delete userProjectCard by id")
    public void deleteUserCardProjectById(@PathVariable Integer id) {
      try {
          userProjectCardDao.deleteById(id);
      }catch(Exception e) {
          new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    //удалить ВСЕ карточки
    @DeleteMapping
    @ApiOperation(value = "delete all userProjectCard")
    public void deleteUserCardProjectAll() {
            try{
                userProjectCardDao.deleteAll();
            }
            catch(Exception e) {
                new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
    }

    //редактировать карточку "В работе" или "Черновик"
    //присвоить статус "Архив" карточке
    @PutMapping(value = "update/{id}",consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "update userProjectCard with status 'In work' out 'Draft'")
    public void updateUserProjectCardWithStatusInWorkOurDraft(@PathVariable("id")Integer id,@RequestBody @NotNull UserProjectCard userProjectCard) throws Exception {
          userProjectCardDao.updateInWorkAndDraft(id,userProjectCard);
    }


    //вывод карточек без черновика!
    @GetMapping("/withoutDraft")
    public List<UserProjectCard> allUserProjectCardWithoutDraft(){
       return userProjectCardDao.allUserProjectCardWithoutDraft();
    }

    //редактирование карточки со статусом "Архив"
    @PutMapping(value = "statusArchive",consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addStatusArchive(@PathVariable Integer id,
                                 @RequestBody UserProjectCard userProjectCard){
        userProjectCardDao.addStatusArch(id,userProjectCard);
    }

    //удалить черновик
    @DeleteMapping(value = "deleteDraft/{id}")
    public void deleteDraft(@PathVariable Integer id){
        userProjectCardDao.deleteDraft(id);
    }


}