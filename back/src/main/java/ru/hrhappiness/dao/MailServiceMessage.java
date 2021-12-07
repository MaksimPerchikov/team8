package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class MailServiceMessage {

    @Autowired
    private JavaMailSender mailSender;


    //метод, рассылающий на почту
    public void sendEmail(String email,String subject, String message){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom("hrhappiness123@gmail.com");
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);

        mailSender.send(simpleMailMessage);

        System.out.println("Email sent successfully!");
    }
}
