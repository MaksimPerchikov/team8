package ru.hrhappiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.TypeProjectFirstCell;

@Repository
public interface TypeProjectFirstCellRepository extends JpaRepository<TypeProjectFirstCell,Integer> {

}
