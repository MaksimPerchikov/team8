/*
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.DevelopmentMethodology;
import ru.hrhappiness.entitys.IsTechnicalWritersOnProject;
import ru.hrhappiness.repository.DevelopmentMethodologyRepository;
import ru.hrhappiness.repository.IsTechnicalWritersOnProjectRepository;

import java.util.List;

@Service
public class IsTechnicalWritersOnProjectDao {

    private final IsTechnicalWritersOnProjectRepository isTechnicalWritersOnProjectRepository;

    @Autowired
    public IsTechnicalWritersOnProjectDao(IsTechnicalWritersOnProjectRepository
                                                      isTechnicalWritersOnProjectRepository) {
        this.isTechnicalWritersOnProjectRepository = isTechnicalWritersOnProjectRepository;
    }

    public void create(IsTechnicalWritersOnProject isTechnicalWritersOnProject){
        isTechnicalWritersOnProjectRepository.save(isTechnicalWritersOnProject);
    }
    public void deleteAll(){
        isTechnicalWritersOnProjectRepository.deleteAll();
    }

    public List<IsTechnicalWritersOnProject> findAll(){
        return isTechnicalWritersOnProjectRepository.findAll();
    }
}
*/
