package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.DevelopmentMethodology;

@Repository
public interface DevelopmentMethodologyRepository extends JpaRepository<DevelopmentMethodology,Long> {
}
