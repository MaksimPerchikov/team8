package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.StatusProject;

@Repository
public interface StatusProjectRepository extends JpaRepository<StatusProject,String> {
}
