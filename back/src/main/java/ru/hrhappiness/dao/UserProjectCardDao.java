package ru.hrhappiness.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.UserProjectCard;
import ru.hrhappiness.repository.UserProjectCardRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserProjectCardDao {

    private final UserProjectCardRepository userProjectCardRepository;

    UserProjectCard userProjectCard;

    @Autowired
    public UserProjectCardDao(UserProjectCardRepository userProjectCardRepository) {
        this.userProjectCardRepository = userProjectCardRepository;

    }

    public void createUserProjectCard(UserProjectCard userProjectCard){
        userProjectCardRepository.save(userProjectCard);
    }

    public Optional<UserProjectCard> findById(Integer id){
        return userProjectCardRepository.findById(id);
    }

    public List<UserProjectCard> findAll(){
       return userProjectCardRepository.findAll();
    }

    public void deleteById(Integer id){
        userProjectCardRepository.deleteById(id);
    }
    public void deleteAll(){
        userProjectCardRepository.deleteAll();
    }


    public String testMethod(){
        return "testLine";
    }
}
