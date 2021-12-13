package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.IsDocumentationOnProject;

@Repository
public interface IsDocumentationOnProjectRepository extends JpaRepository<IsDocumentationOnProject,Long> {
}
