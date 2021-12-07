package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.myTest.MyTest;
import ru.hrhappiness.repository.myTest.MyTestRepository;

import java.util.List;

@Service
public class MyTestDao {

  private final MyTestRepository myTestRepository;

  @Autowired
    public MyTestDao(MyTestRepository myTestRepository){
      this.myTestRepository = myTestRepository;
  }

  public MyTest createMyTest(MyTest myTest){
       return myTestRepository.save(myTest);
  }
  public List<MyTest> findAll(){
      return myTestRepository.findAll();
  }
  public void deleteAllMyTest(){
      myTestRepository.deleteAll();
  }


}
