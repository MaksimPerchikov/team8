package ru.hrhappiness.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.MailServiceMessageDao;
import ru.hrhappiness.dao.UserProjectCardDao;

import ru.hrhappiness.entitys.userProjectCard.UserProjectCard;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hrhappiness")
@Api(value = "userProjectCard",description = "crud operations")
public class UserProjectCardRestController {

    private final UserProjectCardDao userProjectCardDao;



    @Autowired
    public UserProjectCardRestController(UserProjectCardDao userProjectCardDao) {
        this.userProjectCardDao = userProjectCardDao;
    }

    //приветствие
    @GetMapping(value = "/hi")
    @ApiOperation(value = "welcome page")
    public HashMap<String,String> hi(){
        HashMap<String,String> map = new HashMap<>();
        map.put("it's","ok");
        return map;
    }

    //создание карточки пользователя
 //   @PreAuthorize("hasAuthority('userProjectCard:create')")
    @PostMapping(value = "/create")
    @ApiOperation(value = "create userProjectCard")
    public void createUserCard(@RequestBody UserProjectCard userProjectCard) {
        userProjectCardDao.createUserProjectCard(userProjectCard);
    }


    //найти Карточку пользователя по Айди
  //  @PreAuthorize("hasAuthority('userProjectCard:readById')")
    @ApiOperation(value = "show userProjectCard by id", response = Optional.class)
    @GetMapping(value = "/search/{id}", consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<UserProjectCard> findById(@PathVariable("id") Integer id) {
        if (id == null) {
            new ResponseEntity<UserProjectCard>(HttpStatus.BAD_REQUEST);
        }
        return userProjectCardDao.findById(id);
    }

    //вывести все карточки пользователей
  //  @PreAuthorize("hasAnyRole('ADMIN','UP')")
    @GetMapping(value = "/all")
    @ApiOperation(value = "show all userProjectCards", response = List.class)
    public List<UserProjectCard> findAllUsersCards() {
        return userProjectCardDao.findAll();
    }

    //удалить карточку по id
   // @PreAuthorize("hasAuthority('userProjectCard:deleteCardById')")
    @DeleteMapping("/{id}")
    @ApiOperation(value = "delete userProjectCard by id")
    public void deleteUserCardProjectById(@PathVariable("id") Integer id) {
      try {
          userProjectCardDao.deleteById(id);
      }catch(Exception e) {
          new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }

    //удалить ВСЕ карточки
 //   @PreAuthorize("hasAuthority('userProjectCard:DeleteAllCards')")
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
  //  @PreAuthorize("hasAnyAuthority('UserProjectCard:updateCard')")
    @PutMapping(value = "update/{id}",consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "update userProjectCard with status 'In work' out 'Draft'")
    public void updateUserProjectCardWithStatusInWorkOurDraft(@PathVariable("id")Integer id,@RequestBody UserProjectCard userProjectCard) throws Exception {
          userProjectCardDao.updateInWorkAndDraft(id,userProjectCard);
    }


    //вывод карточек без черновика!
  //  @PreAuthorize("hasAnyRole('ADMIN','UP','RC','NO','NP')")
    @GetMapping("/withoutDraft")
    @ApiOperation(value = "find all cards without cards with status 'Draft'")
    public List<UserProjectCard> allUserProjectCardWithoutDraft(){
       return userProjectCardDao.allUserProjectCardWithoutDraft();
    }


    //редактирование карточки со статусом "Архив" и внести изменения
 //   @PreAuthorize("hasAnyAuthority('userProjectCard:archiving')")
    @ApiOperation(value = "update cards with status 'Archive' by id")
    @PutMapping(value = "statusArchive/{id}",consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addStatusArchive(@PathVariable("id") Integer id,
                                 @RequestBody UserProjectCard userProjectCard){
        userProjectCardDao.addStatusArch(id,userProjectCard);
    }

    //удалить черновик
 //   @PreAuthorize("hasAnyAuthority('userProjectCard:deleteCard','userProjectCard:deleteCardDraft')")
    @ApiOperation(value = "delete draft by id")
    @DeleteMapping(value = "deleteDraft/{id}")
    public void deleteDraft(@PathVariable("id") Integer id){
        userProjectCardDao.deleteDraft(id);
    }



    //восстановление из "Архива" на "В работе"(срабатывает, если статус только Архив!)
  //  @PreAuthorize("hasAnyAuthority('userProjectCard:restoring from archive to in progress')")
    @ApiOperation(value = "restoring from 'Archive' to 'In work'")
    @PutMapping(value = "/restoring/{id}")
    public UserProjectCard restoringFromArchiveToInWorkMethod(@PathVariable("id") Integer id,
                                                              @RequestBody UserProjectCard userProjectCard){
     return userProjectCardDao.restoringFromArchiveToInWork(id,userProjectCard);
    }

    /*@GetMapping(value = "/log")
    public String authorizationUsers(User user){
        String str = user.getPassword()+user.getName();
        return str;
    }*/

}