package ru.hrhappiness.repository.message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.message.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
}
