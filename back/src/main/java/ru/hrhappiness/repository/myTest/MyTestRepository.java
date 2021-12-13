package ru.hrhappiness.repository.myTest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hrhappiness.entitys.myTest.MyTestNameClass;

@Repository
public interface MyTestRepository extends JpaRepository<MyTestNameClass,Long> {
}
