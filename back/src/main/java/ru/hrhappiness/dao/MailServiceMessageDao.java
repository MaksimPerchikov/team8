package ru.hrhappiness.dao;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import javax.swing.*;

@Service
public class MailServiceMessageDao {

    @Getter
    private final String forEmail = "hrhappiness123@gmail.com";//почта, с которой идет рассылка

    @Autowired
    private JavaMailSender mailSender;


    //Готовый, основной метод.
    //Метод, рассылающий на почту(почта отправителя указана автоматически)
    public void sendEmailMain(String email,String subject, String message){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom(forEmail);
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);


        mailSender.send(simpleMailMessage);

        System.out.println("Email sent successfully!");
    }


    public String emailShow(){
        return forEmail;
    }


    //метод, рассылающий на почту с указанием почты отправителя!
    public void sendEmail(String forEmail,String email,String subject, String message){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom(forEmail);
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);


        mailSender.send(simpleMailMessage);

        System.out.println("Email sent successfully!");
    }

}
