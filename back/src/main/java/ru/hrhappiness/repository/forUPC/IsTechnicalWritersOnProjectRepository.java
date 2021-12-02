package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.IsTechnicalWritersOnProject;
@Repository
public interface IsTechnicalWritersOnProjectRepository extends JpaRepository<IsTechnicalWritersOnProject,Long> {
}
