/*
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.customers.Customer;
import ru.hrhappiness.entitys.userProjectCard.SetNameProjects;
import ru.hrhappiness.repository.SetNameProjectsRepository;

import java.util.List;
import java.util.Set;

@Service
public class SetNameProjectsDao {
    private final SetNameProjectsRepository setNameProjectsRepository;

    @Autowired
    public SetNameProjectsDao(SetNameProjectsRepository setNameProjectsRepository) {
        this.setNameProjectsRepository = setNameProjectsRepository;
    }

    public SetNameProjects createSNP(SetNameProjects setNameProjects){
        return setNameProjectsRepository.save(setNameProjects);
    }

    public List<SetNameProjects> findAllSNP(){
        return setNameProjectsRepository.findAll();
    }

    public void deleteAllSNP(){
        setNameProjectsRepository.deleteAll();
    }
}
*/
