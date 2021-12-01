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


    //private final UserProjectCardDraftRepository userProjectCardDraftRepository и UserProjectCardDraft userProjectCardDraft
    // на них пока что не надо обращать внимание

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


 /*public void update(UserProjectCard userProjectCardUpdate,Integer id){
        if(userProjectCard.getArchive().equals(true)){

            if(userProjectCardDraft.getId().equals(id)){
                userProjectCardRepository.save(userProjectCardUpdate);
                userProjectCard.setId(id);
                userProjectCardDraftRepository.deleteById(id);
            }
        }
    }*/



    public String testMethod(){
        return "testLine";
    }
}
