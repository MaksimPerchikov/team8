/*
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.DevelopmentMethodology;
import ru.hrhappiness.entitys.ProjectType1;
import ru.hrhappiness.repository.DevelopmentMethodologyRepository;

import java.util.List;

@Service
public class DevelopmentMethodologyDao {

    private final DevelopmentMethodologyRepository developmentMethodologyRepository;

    @Autowired
    public DevelopmentMethodologyDao(DevelopmentMethodologyRepository developmentMethodologyRepository) {
        this.developmentMethodologyRepository = developmentMethodologyRepository;
    }

    public void create(DevelopmentMethodology developmentMethodology){
        developmentMethodologyRepository.save(developmentMethodology);
    }
    public void deleteAll(){
        developmentMethodologyRepository.deleteAll();
    }

    public List<DevelopmentMethodology> findAll(){
        return developmentMethodologyRepository.findAll();
    }
}
*/
