package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.ProjectType1;

@Repository
public interface ProjectType1Repository extends JpaRepository<ProjectType1,Long> {
}

