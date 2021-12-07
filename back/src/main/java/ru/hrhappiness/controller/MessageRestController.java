package ru.hrhappiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.dao.MailServiceMessage;
import ru.hrhappiness.entitys.message.Message;

@RestController
@RequestMapping("sendMessage")
public class MessageRestController {

    private final MailServiceMessage mailServiceMessage;

    @Autowired
    public MessageRestController(MailServiceMessage mailServiceMessage){
        this.mailServiceMessage = mailServiceMessage;
    }

    @PostMapping
    public void createAndSendMessage(@RequestBody Message message){

        mailServiceMessage.sendEmail(message.getEmail(),
                                "MyNameProject",
                                    message.getMessage());
    }

    @GetMapping
    public void myTest(){
        mailServiceMessage.sendEmail("kewoyi7518@terasd.com",
                                    "MyNameProject",
                                        "mess");
    }
}
