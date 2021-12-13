package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.myTest.MyTestNameClass;

import ru.hrhappiness.entitys.myTest.SurAfterName;
import ru.hrhappiness.repository.myTest.MyTestRepository;
import ru.hrhappiness.repository.myTest.SurRepository;

import java.util.List;

@Service
public class MyTestDao {

  private final MyTestRepository myTestRepository;
  private final SurRepository surRepository;

  @Autowired
    public MyTestDao(MyTestRepository myTestRepository,
                     SurRepository surRepository){
      this.myTestRepository = myTestRepository;
      this.surRepository = surRepository;
  }


  public MyTestNameClass createMyTest(MyTestNameClass myTestNameClass){
       return myTestRepository.save(myTestNameClass);
  }



  public List<MyTestNameClass> findAll(){
      return myTestRepository.findAll();
  }


  public void deleteAllMyTest(){
      myTestRepository.deleteAll();
  }


  public SurAfterName createSur(SurAfterName surAfterName){
      return surRepository.save(surAfterName);
  }

  public List<SurAfterName> findAllSur(){
      return surRepository.findAll();
  }


}
