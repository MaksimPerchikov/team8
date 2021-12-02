package ru.hrhappiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hrhappiness.entitys.UserProjectCard;
import ru.hrhappiness.entitys.UserProjectCardDraft;

public interface UserProjectCardDraftRepository extends JpaRepository<UserProjectCard,Integer> {
}
