package ru.hrhappiness.dao;



import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hrhappiness.entitys.customers.Customer;
import ru.hrhappiness.entitys.userProjectCard.*;
import ru.hrhappiness.repository.customers.CustomerRepository;
import ru.hrhappiness.repository.forUPC.*;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserProjectCardDao {

    private final UserProjectCardRepository userProjectCardRepository;
    private final StatusProjectRepository statusProjectRepository;
    private final WorkModelRepository workModelRepository;
    private final DevelopmentResultRepository developmentResultRepository;
    private final ProductTypeRepository productTypeRepository;
    private final ProjectTypeRepository projectTypeRepository;
    private final StageProjectRepository stageProjectRepository;
    private final DevelopmentMethodologyRepository developmentMethodologyRepository;
    private final ProductDevelopmentRepository productDevelopmentRepository;
    private final IsTestersOnProjectRepository isTestersOnProjectRepository;
    private final IsTechnicalWritersOnProjectRepository isTechnicalWritersOnProjectRepository;
    private final LocationRepository locationRepository;
    private final OvertimeRepository overtimeRepository;
    private final CustomerRepository customerRepository;
    private final IsDocumentationOnProjectRepository isDocumentationOnProjectRepository;

    @Autowired
    public UserProjectCardDao(UserProjectCardRepository userProjectCardRepository,
                              StatusProjectRepository statusProjectRepository,
                              WorkModelRepository workModelRepository,
                              DevelopmentResultRepository developmentResultRepository,
                              ProductTypeRepository productTypeRepository,
                              ProjectTypeRepository projectTypeRepository,
                              StageProjectRepository stageProjectRepository,
                              DevelopmentMethodologyRepository developmentMethodologyRepository,
                              ProductDevelopmentRepository productDevelopmentRepository,
                              IsTestersOnProjectRepository isTestersOnProjectRepository,
                              IsTechnicalWritersOnProjectRepository isTechnicalWritersOnProjectRepository,
                              LocationRepository locationRepository,
                              OvertimeRepository overtimeRepository,
                              CustomerRepository customerRepository,
                              IsDocumentationOnProjectRepository isDocumentationOnProjectRepository) {
        this.userProjectCardRepository = userProjectCardRepository;
        this.statusProjectRepository = statusProjectRepository;
        this.workModelRepository = workModelRepository;
        this.developmentResultRepository = developmentResultRepository;
        this.productTypeRepository = productTypeRepository;
        this.projectTypeRepository = projectTypeRepository;
        this.stageProjectRepository = stageProjectRepository;
        this.developmentMethodologyRepository = developmentMethodologyRepository;
        this.productDevelopmentRepository = productDevelopmentRepository;
        this.isTestersOnProjectRepository = isTestersOnProjectRepository;
        this.isTechnicalWritersOnProjectRepository = isTechnicalWritersOnProjectRepository;
        this.locationRepository = locationRepository;
        this.overtimeRepository = overtimeRepository;
        this.customerRepository = customerRepository;
        this.isDocumentationOnProjectRepository = isDocumentationOnProjectRepository;

    }

    //создание Краточки проекта (localhost:8080/hrhappines/)
    public void createUserProjectCard(UserProjectCard userProjectCard) {
     /*       //status ПРИМЕР
            List<StatusProject> statusProjectList = statusProjectRepository.findAll();//создаем Лист,в который помещаем все Статусы из нашей БД(предварительно заполнил)
            Optional<StatusProject> statusPrOp = statusProjectList.stream()
                    .filter(st ->st.getStatusProjectName().equals(userProjectCard.getStatus()))//пробегаемся по этому листу и ищем значение ,которое совпадает с переданным UserProjectCard userProjectCard
                    .findFirst();//получаем это значение
            userProjectCard.setStatus(statusPrOp.get().getStatusProjectName()); //вызываем у переданного объекта UserProjectCard userProjectCard сет и заполняем его значением,которое отсортировали и поместили в Лист1
        */

        try {
            //workModel раньше --------(projectType1)
            List<WorkModel> projectType1List = workModelRepository.findAll();
            Optional<WorkModel> workModelOp = projectType1List.stream()
                    .filter(pt1 -> pt1.getWorkModelName().equals(userProjectCard.getWorkModel()))
                    .findFirst();
            userProjectCard.setWorkModel(workModelOp.get().getWorkModelName());
            //получаем некоторое значение workModel и проверям,если Fix - то поле procedureForBringingPeopleToProject недоступно
            if (userProjectCard.getWorkModel().equals("Fix")) {
                userProjectCard.setProcedureForBringingPeopleToProject(null);
            }
        } catch (Exception e) {
            userProjectCard.setWorkModel("");
        }

        try {
            //developmentResult раньше-----(projectType2)
            List<DevelopmentResult> developmentResultList = developmentResultRepository.findAll();
            Optional<DevelopmentResult> developmentResultOp = developmentResultList.stream()
                    .filter(pr2 -> pr2.getDevelopmentResultName().equals(userProjectCard.getDevelopmentResult()))
                    .findFirst();
            userProjectCard.setDevelopmentResult(developmentResultOp.get().getDevelopmentResultName());
        } catch (Exception e) {
            userProjectCard.setDevelopmentResult("");
        }
        try {
            //productType раньше -------(projectType3)
            List<ProductType> productTypeList = productTypeRepository.findAll();
            Optional<ProductType> projectType3Op = productTypeList.stream()
                    .filter(pt3 -> pt3.getProductTypeName().equals(userProjectCard.getProductType()))
                    .findFirst();
            userProjectCard.setProductType(projectType3Op.get().getProductTypeName());
        } catch (Exception e) {
            userProjectCard.setProductType("");
        }
        try {
            //projectType раньше ------(projectType4)
            List<ProjectType> projectTypeList = projectTypeRepository.findAll();
            Optional<ProjectType> projectType4Op = projectTypeList.stream()
                    .filter(pr4 -> pr4.getProjectTypeName().equals(userProjectCard.getProjectType()))
                    .findFirst();
            userProjectCard.setProjectType(projectType4Op.get().getProjectTypeName());
        } catch (Exception e) {
            userProjectCard.setProjectType("");
        }
        try {
            //StageProject
            List<StageProject> stageProjectList = stageProjectRepository.findAll();
            Optional<StageProject> stageProjectOp = stageProjectList.stream()
                    .filter(stageP -> stageP.getStageProjectName().equals(userProjectCard.getProjectStage()))
                    .findFirst();
            userProjectCard.setProjectStage(stageProjectOp.get().getStageProjectName());
        } catch (Exception e) {
            userProjectCard.setProjectStage("");
        }
        try {
            //DevelopmentMethodology
            List<DevelopmentMethodology> developmentMethodologyList =
                    developmentMethodologyRepository.findAll();
            Optional<DevelopmentMethodology> developmentMethodologyOp =
                    developmentMethodologyList.stream()
                            .filter(dm -> dm.getDevelopmentMethodologyName().
                                    equals(userProjectCard.getDevelopmentMethodology()))
                            .findFirst();
            userProjectCard.setDevelopmentMethodology(developmentMethodologyOp.get().getDevelopmentMethodologyName());
        } catch (Exception e) {
            userProjectCard.setDevelopmentMethodology("");
        }
        try {
            //ProductDevelopment
            List<ProductDevelopment> productDevelopmentsList =
                    productDevelopmentRepository.findAll();
            Optional<ProductDevelopment> productDevelopmentOp =
                    productDevelopmentsList.stream()
                            .filter(prd -> prd.getProductDevelopmentName().equals(userProjectCard.getProductDevelopment()))
                            .findFirst();
            userProjectCard.setProductDevelopment(productDevelopmentOp.get().getProductDevelopmentName());
        } catch (Exception e) {
            userProjectCard.setProductDevelopment("");
        }
        try {
            //isTestersInProject
            List<IsTestersOnProject> isTestersOnProjectList =
                    isTestersOnProjectRepository.findAll();
            Optional<IsTestersOnProject> isTestersOnProjectOp =
                    isTestersOnProjectList.stream()
                            .filter(itop -> itop.getIsTestersOnProjectName()
                                    .equals(userProjectCard.getIsTestersOnProject()))
                            .findFirst();
            userProjectCard.setIsTestersOnProject(isTestersOnProjectOp.get().getIsTestersOnProjectName());
        } catch (Exception e) {
            userProjectCard.setIsTestersOnProject("");
        }
        try {
            //IsTechnicalWritersOnProject
            List<IsTechnicalWritersOnProject> isTechnicalWritersOnProjectList =
                    isTechnicalWritersOnProjectRepository.findAll();
            Optional<IsTechnicalWritersOnProject> isTechnicalWritersOnProjectOp =
                    isTechnicalWritersOnProjectList.stream()
                            .filter(itwop -> itwop.getIsTechnicalWritersOnProjectName()
                                    .equals(userProjectCard.getIsTechnicalWritersOnProject()))
                            .findFirst();
            userProjectCard.setIsTechnicalWritersOnProject(isTechnicalWritersOnProjectOp.get().getIsTechnicalWritersOnProjectName());
        } catch (Exception e) {
            userProjectCard.setIsTechnicalWritersOnProject("");
        }

        try {
            //Location
            List<Location> locationList = locationRepository.findAll();
            Optional<Location> locationOp = locationList.stream()
                    .filter(location -> location.getLocationName().equals(userProjectCard.getLocation()))
                    .findFirst();
            userProjectCard.setLocation(locationOp.get().getLocationName());
            //получаем некоторое значение локейшн и проверям,если Удаленно
            // - то поле address недоступно, так как отпадает его смысл из-за работы НЕ в офисе
            if (userProjectCard.getLocation().equals("Удаленно")) {
                userProjectCard.setAddress(null);
            }

        } catch (Exception e) {
            userProjectCard.setLocation("");
        }
        try {
            //Overtime
            List<Overtime> overtimesList = overtimeRepository.findAll();
            Optional<Overtime> overtimeOp = overtimesList.stream()
                    .filter(overtime -> overtime.getOvertimeName().equals(userProjectCard.getOvertimes()))
                    .findFirst();
            userProjectCard.setOvertimes(overtimeOp.get().getOvertimeName());
        } catch (Exception e) {
            userProjectCard.setOvertimes("");
        }


        try {
            //isDocumentationOnProject
            List<IsDocumentationOnProject> isDocumentationOnProjectList =
                    isDocumentationOnProjectRepository.findAll();
            Optional<IsDocumentationOnProject> isDocumentationOnProjectOp =
                    isDocumentationOnProjectList.stream()
                            .filter(idp -> idp.getIsDocumentationOnProjectName()
                                    .equals(userProjectCard.getIsDocumentationOnProject()))
                            .findFirst();
            userProjectCard.setIsDocumentationOnProject(isDocumentationOnProjectOp.get().getIsDocumentationOnProjectName());

            if (userProjectCard.getIsDocumentationOnProject().equals("Нет")) {
                userProjectCard.setIsGOST(null);
            }
        } catch (Exception e) {
            userProjectCard.setIsDocumentationOnProject("");
        }

        try {
            //Customer
            List<Customer> customerNameList = customerRepository.findAll();
            Optional<Customer> customerOp = customerNameList.stream()
                    .filter(customer -> customer.getCompanyName().equals(userProjectCard.getCustomerName()))
                    .findFirst();
            userProjectCard.setCustomerName(customerOp.get().getCompanyName());
        } catch (Exception e) {
            userProjectCard.setCustomerName(null);
        }

        userProjectCardRepository.save(userProjectCard);
    }


    //редактировать карточку "В работе" или "Черновик", но не архив
    //присвоить статус "Архив" карточке
    public void updateInWorkAndDraft(Integer id, UserProjectCard userProjectCard) throws Exception {
            if(userProjectCardRepository.findById(id).get().getStatus()
                    .toLowerCase(Locale.ROOT)
                    .equals("архив")
            || userProjectCardRepository.findById(id).get().getStatus()
                    .toLowerCase(Locale.ROOT)
                    .equals("archive")) {
                throw new Exception("Error");
            }else {
                userProjectCardRepository.deleteById(id);
                userProjectCardRepository.save(userProjectCard);
            }
    }

    //редактировать карточку со статусом "Архив"
    public void addStatusArch(Integer id,UserProjectCard userProjectCard){

        if(userProjectCardRepository.getById(id).getStatus()
                .toLowerCase(Locale.ROOT)
                .equals("архив")||userProjectCardRepository.findById(id).get().getStatus()
                .toLowerCase(Locale.ROOT)
                .equals("archive"))
        {
            userProjectCardRepository.deleteById(id);
            userProjectCardRepository.save(userProjectCard);
        }
    }

    //вывод карточек БЕЗ черновика!
    public List<UserProjectCard> allUserProjectCardWithoutDraft(){
        List<UserProjectCard> userProjectCardList =  userProjectCardRepository.findAll();

        List<UserProjectCard> userProjectCardOp = userProjectCardList.stream()
                .filter(n -> !(n.getStatus().toLowerCase().replaceAll("\\s", "").equals("черновик")||
                        n.getStatus().toLowerCase().replaceAll("\\s", "").equals("draft")))
                .collect(Collectors.toList());
        return userProjectCardOp;
    }

    //удалить черновик
    public void deleteDraft(Integer id){
        List<UserProjectCard> userProjectCardList = userProjectCardRepository.findAll();
        Optional<UserProjectCard> userProjectCardOp = userProjectCardList.stream()
                .filter(n->n.getId().equals(id))
                .findFirst();
        String str = userProjectCardOp.get().getStatus();
       if(str.toLowerCase(Locale.ROOT).replaceAll("\\s", "").equals("черновик") ||
               str.toLowerCase().replaceAll("\\s", "").equals("draft")){
           userProjectCardRepository.deleteById(id);
       }
    }

    //восстановление из архива
    public UserProjectCard restoringFromArchiveToInWork(Integer id,UserProjectCard userProjectCard){
        String str = userProjectCard.getStatus();
        if(str.toLowerCase(Locale.ROOT).replaceAll("\\s", "").equals("архив") ||
                str.toLowerCase().replaceAll("\\s", "").equals("archive")){
            userProjectCardRepository.deleteById(id);
            userProjectCard.setStatus("Черновик");
         userProjectCardRepository.save(userProjectCard);
        }
        return userProjectCard;
    }

    //Найти карточку по айди
    public Optional<UserProjectCard> findById(Integer id){
        return userProjectCardRepository.findById(id);
    }

    //Найти все карточки
    public List<UserProjectCard> findAll(){
       return userProjectCardRepository.findAll();
    }

    //удаление карточки пользователя
    public void deleteById(Integer id){
        userProjectCardRepository.deleteById(id);
    }

    //удалить все карточки всех пользователей
    public void deleteAll(){
        userProjectCardRepository.deleteAll();
    }


}
