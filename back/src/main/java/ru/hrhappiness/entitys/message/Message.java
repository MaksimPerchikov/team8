package ru.hrhappiness.entitys.message;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message {

    @Id
    @GeneratedValue
    private Long id;
    private String email;//кому отправляем
    private String message;//само сообщение
    private String subject;//тема сообщения
}
