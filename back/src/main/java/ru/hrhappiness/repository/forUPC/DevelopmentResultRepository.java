package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.DevelopmentResult;

@Repository
public interface DevelopmentResultRepository extends JpaRepository<DevelopmentResult,Long> {
}
