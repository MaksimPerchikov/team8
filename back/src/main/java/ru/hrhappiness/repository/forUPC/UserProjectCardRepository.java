package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.UserProjectCard;

@Repository
public interface UserProjectCardRepository extends JpaRepository<UserProjectCard,Integer> {
}
