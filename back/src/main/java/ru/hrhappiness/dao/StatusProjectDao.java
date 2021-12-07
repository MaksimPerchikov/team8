
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.userProjectCard.StatusProject;
import ru.hrhappiness.repository.forUPC.StatusProjectRepository;

import java.util.List;

@Service
public class StatusProjectDao {

    private final StatusProjectRepository statusProjectRepository;

    @Autowired
    public StatusProjectDao(StatusProjectRepository statusProjectRepository) {
        this.statusProjectRepository = statusProjectRepository;
    }
    public void create(StatusProject statusProject){
        statusProjectRepository.save(statusProject);
    }
    public void deleteAll(){
        statusProjectRepository.deleteAll();
    }

    public List<StatusProject> findAll(){
        return statusProjectRepository.findAll();
    }


}

