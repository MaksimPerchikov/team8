/*
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.IsTestersOnProject;
import ru.hrhappiness.entitys.ProjectType1;
import ru.hrhappiness.repository.IsTestersOnProjectRepository;
import ru.hrhappiness.repository.ProjectType1Repository;

import java.util.List;
@Service
public class IsTestersOnProjectDao {
    private final IsTestersOnProjectRepository isTestersOnProjectRepository;

    @Autowired
    public IsTestersOnProjectDao(IsTestersOnProjectRepository isTestersOnProjectRepository) {
        this.isTestersOnProjectRepository = isTestersOnProjectRepository;
    }
    public void create(IsTestersOnProject isTestersOnProject){
        isTestersOnProjectRepository.save(isTestersOnProject);
    }
    public void deleteAll(){
        isTestersOnProjectRepository.deleteAll();
    }

    public List<IsTestersOnProject> findAll(){
        return isTestersOnProjectRepository.findAll();
    }
}
*/
