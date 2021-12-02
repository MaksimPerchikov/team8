package ru.hrhappiness.repository.forUPC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.userProjectCard.Overtime;

@Repository
public interface OvertimeRepository extends JpaRepository<Overtime,String> {
}
