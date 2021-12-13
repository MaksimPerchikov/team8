package ru.hrhappiness.repository.myTest;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.myTest.SurAfterName;

@Repository
public interface SurRepository extends JpaRepository<SurAfterName,Long> {
}
