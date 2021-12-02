package ru.hrhappiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.TypeProjectSecondCell;

@Repository
public interface TypeProjectSecondCellRepository extends JpaRepository<TypeProjectSecondCell,Integer> {
}
