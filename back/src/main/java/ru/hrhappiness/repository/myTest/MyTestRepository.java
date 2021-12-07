package ru.hrhappiness.repository.myTest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.myTest.MyTest;

@Repository
public interface MyTestRepository extends JpaRepository<MyTest,Long> {
}
