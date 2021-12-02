package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.ProjectType3;
@Repository
public interface ProjectType3Repository extends JpaRepository<ProjectType3,Long> {
}
