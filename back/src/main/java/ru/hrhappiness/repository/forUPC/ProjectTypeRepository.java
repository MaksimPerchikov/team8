package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.ProjectType;

@Repository
public interface ProjectTypeRepository extends JpaRepository<ProjectType,Long> {
}
