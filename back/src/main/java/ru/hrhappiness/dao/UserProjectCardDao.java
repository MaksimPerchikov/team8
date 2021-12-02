package ru.hrhappiness.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.userProjectCard.*;
import ru.hrhappiness.repository.forUPC.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserProjectCardDao {

    private final UserProjectCardRepository userProjectCardRepository;
    private final StatusProjectRepository statusProjectRepository;
    private final ProjectType1Repository projectType1Repository;
    private final ProjectType2Repository projectType2Repository;
    private final ProjectType3Repository projectType3Repository;
    private final ProjectType4Repository projectType4Repository;
    private final StageProjectRepository stageProjectRepository;
    private final DevelopmentMethodologyRepository developmentMethodologyRepository;
    private final ProductDevelopmentRepository productDevelopmentRepository;

    @Autowired
    public UserProjectCardDao(UserProjectCardRepository userProjectCardRepository,
                              StatusProjectRepository statusProjectRepository,
                              ProjectType1Repository projectType1Repository,
                              ProjectType2Repository projectType2Repository,
                              ProjectType3Repository projectType3Repository,
                              ProjectType4Repository projectType4Repository,
                              StageProjectRepository stageProjectRepository,
                              DevelopmentMethodologyRepository developmentMethodologyRepository,
                              ProductDevelopmentRepository productDevelopmentRepository) {
        this.userProjectCardRepository = userProjectCardRepository;
        this.statusProjectRepository = statusProjectRepository;
        this.projectType1Repository = projectType1Repository;
        this.projectType2Repository =projectType2Repository;
        this.projectType3Repository = projectType3Repository;
        this.projectType4Repository = projectType4Repository;
        this.stageProjectRepository = stageProjectRepository;
        this.developmentMethodologyRepository = developmentMethodologyRepository;
        this.productDevelopmentRepository = productDevelopmentRepository;

    }

    public void createUserProjectCard(UserProjectCard userProjectCard){
        //status
        List<StatusProject> statusProjectList = statusProjectRepository.findAll();//создаем Лист,в который помещаем все Статусы из нашей БД(предварительно заполнил)
        Optional<StatusProject> statusPrOp = statusProjectList.stream()
                       .filter(st ->st.getStatusProjectName().equals(userProjectCard.getStatus()))//пробегаемся по этому листу и ищем значение ,которое совпадает с переданным UserProjectCard userProjectCard
                .findFirst();//получаем это значение
       userProjectCard.setStatus(statusPrOp.get().getStatusProjectName()); //вызываем у переданного объекта UserProjectCard userProjectCard сет и заполняем его значением,которое отсортировали и поместили в Лист1

        //projectType1
        List<ProjectType1> projectType1List = projectType1Repository.findAll();
        Optional<ProjectType1> projectType1Op = projectType1List.stream()
                .filter(pt1 -> pt1.getProjectType1Name().equals(userProjectCard.getProjectType1()))
                .findFirst();
        userProjectCard.setProjectType1(projectType1Op.get().getProjectType1Name());

        //projectType2
        List<ProjectType2> projectType2List = projectType2Repository.findAll();
        Optional<ProjectType2> projectType2Op = projectType2List.stream()
                .filter(pr2->pr2.getProjectType2Name().equals(userProjectCard.getProjectType2()))
                .findFirst();
        userProjectCard.setProjectType2(projectType2Op.get().getProjectType2Name());

        //projectType3
        List<ProjectType3> projectType3List = projectType3Repository.findAll();
        Optional<ProjectType3> projectType3Op = projectType3List.stream()
                        .filter(pt3 -> pt3.getProjectType3Name().equals(userProjectCard.getProjectType3()))
                                .findFirst();
        userProjectCard.setProjectType3(projectType3Op.get().getProjectType3Name());

        //projectType4
        List<ProjectType4> projectType4List = projectType4Repository.findAll();
        Optional<ProjectType4> projectType4Op = projectType4List.stream()
                        .filter(pr4 -> pr4.getProjectType4Name().equals(userProjectCard.getProjectType4()))
                                .findFirst();
        userProjectCard.setProjectType4(projectType4Op.get().getProjectType4Name());

        //StageProject
        List<StageProject> stageProjectList = stageProjectRepository.findAll();
        Optional<StageProject> stageProjectOp = stageProjectList.stream()
                        .filter(stageP -> stageP.getStageProjectName().equals(userProjectCard.getStageProject()))
                                .findFirst();
        userProjectCard.setStageProject(stageProjectOp.get().getStageProjectName());

        //DevelopmentMethodology
        List<DevelopmentMethodology> developmentMethodologyList =
                developmentMethodologyRepository.findAll();
        Optional<DevelopmentMethodology> developmentMethodologyOp =
                developmentMethodologyList.stream()
                                .filter(dm -> dm.getDevelopmentMethodologyName().
                                        equals(userProjectCard.getDevelopmentMethodology()))
                                        .findFirst();
        userProjectCard.setDevelopmentMethodology(developmentMethodologyOp.get().getDevelopmentMethodologyName());

        //ProductDevelopment
        List<ProductDevelopment> productDevelopmentsList =
                productDevelopmentRepository.findAll();
        Optional<ProductDevelopment> productDevelopmentOp =
                productDevelopmentsList.stream()
                                .filter(prd -> prd.getProductDevelopmentName().equals(userProjectCard.getProductDevelopment()))
                                        .findFirst();
        userProjectCard.setProductDevelopment(productDevelopmentOp.get().getProductDevelopmentName());
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



    //изменить статус карточки на Архив:
    public void updateInArchive(UserProjectCard userProjectCard){
        userProjectCardRepository.save(userProjectCard);
    }
    public Optional<UserProjectCard> findByIdForArchive(Integer id){
        return userProjectCardRepository.findById(id);
    }
    public void deleteByIdForArchive(Integer id){
        userProjectCardRepository.deleteById(id);
    }
}
