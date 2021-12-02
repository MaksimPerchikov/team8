package ru.hrhappiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.TypeProjectFourthCell;
@Repository
public interface TypeProjectFourthCellRepository extends JpaRepository<TypeProjectFourthCell,Integer> {
}
