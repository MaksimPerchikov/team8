package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.ProjectType4;

@Repository
public interface ProjectType4Repository extends JpaRepository<ProjectType4,Long> {
}
