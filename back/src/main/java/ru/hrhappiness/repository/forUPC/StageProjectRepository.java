
package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.StageProject;


@Repository
public interface StageProjectRepository extends JpaRepository<StageProject,Long> {
}


