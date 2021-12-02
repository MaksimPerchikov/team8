/*
package ru.hrhappiness.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.ProjectType1;
import ru.hrhappiness.entitys.StageProject;
import ru.hrhappiness.repository.StageProjectRepository;

import java.util.List;

@Service
public class StageProjectDao {

    private final StageProjectRepository stageProjectRepository;
    @Autowired
    public StageProjectDao(StageProjectRepository stageProjectRepository) {
        this.stageProjectRepository = stageProjectRepository;
    }

    public void create(StageProject stageProject){
        stageProjectRepository.save(stageProject);
    }
    public void deleteAll(){
        stageProjectRepository.deleteAll();
    }

    public List<StageProject> findAll(){
        return stageProjectRepository.findAll();
    }
}
*/
