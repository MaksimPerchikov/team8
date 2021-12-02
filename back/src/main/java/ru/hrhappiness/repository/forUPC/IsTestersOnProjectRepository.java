package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.IsTestersOnProject;
@Repository
public interface IsTestersOnProjectRepository extends JpaRepository<IsTestersOnProject,String> {
}
