package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.ProjectType2;

@Repository
public interface ProjectType2Repository extends JpaRepository<ProjectType2,Long> {
}
