package ru.hrhappiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import ru.hrhappiness.dao.MailServiceMessage;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class,args);
        }
}
