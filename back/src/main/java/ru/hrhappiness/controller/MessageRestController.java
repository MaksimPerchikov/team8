package ru.hrhappiness.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.MailServiceMessageDao;
import ru.hrhappiness.entitys.message.Message;

@RestController
@RequestMapping("/hrhappiness/sendMessage")
@Api(value = "messageByGmail",description = "class, which send message by mail")
public class MessageRestController {

    private final MailServiceMessageDao mailServiceMessageDao;

    @Autowired
    public MessageRestController(MailServiceMessageDao mailServiceMessageDao){
        this.mailServiceMessageDao = mailServiceMessageDao;
    }

    //метод, рассылающий сообщения на почту. Нужно указать почту, куда отправлять, subject(тему), message(тело сообщения)
    //поделиться карточкой
    @PostMapping
  //  @PreAuthorize("hasAuthority('messageByGmail:sendMessageMail')")
    @ApiOperation(value = "method, which send message by mail. Instruction(email,subject,message)")
    public void createAndSendMessage(@RequestBody Message message){
        mailServiceMessageDao.sendEmailMain(message.getEmail(),
                                message.getSubject(),
                                    message.getMessage());
        System.out.println("Okay, it's okay.");
    }


    //показать почту,с который идет рассылка
    @GetMapping("/getMail")
  //  @PreAuthorize("hasRole('ADMIN')")
    @ApiOperation(value = "show email, with which send message by mail")
    public String mailShow(){
      return   mailServiceMessageDao.emailShow();

    }


    //тестовый метод
    @GetMapping
    public void myTest(){
        mailServiceMessageDao.sendEmail("hrhappiness123@gmail.com","hepega5766@mykcloud.com",
                "MyNameProject",
                "mess");
        System.out.println("Okay, it's okay.");
    }
}
