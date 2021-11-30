package ru.hrhappiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.UserProjectCard;

@Repository
public interface UserProjectCardRepository extends JpaRepository<UserProjectCard,Integer> {
}
