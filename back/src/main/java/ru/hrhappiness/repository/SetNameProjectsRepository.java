package ru.hrhappiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.SetNameProjects;
@Repository
public interface SetNameProjectsRepository extends JpaRepository<SetNameProjects,Long> {
}
