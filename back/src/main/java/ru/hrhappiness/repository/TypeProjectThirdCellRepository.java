package ru.hrhappiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.TypeProjectThirdCell;
@Repository
public interface TypeProjectThirdCellRepository extends JpaRepository<TypeProjectThirdCell,Integer> {
}
