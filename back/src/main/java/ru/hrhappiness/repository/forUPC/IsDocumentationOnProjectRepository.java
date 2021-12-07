package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hrhappiness.entitys.userProjectCard.IsDocumentationOnProject;

public interface IsDocumentationOnProjectRepository extends JpaRepository<IsDocumentationOnProject,Long> {
}
