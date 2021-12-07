

package ru.hrhappiness.configuration.loaddb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.hrhappiness.entitys.user.User;
import ru.hrhappiness.entitys.userProjectCard.*;
import ru.hrhappiness.repository.forUPC.*;
/*import ru.hrhappiness.entitys.customers.Customer;
import ru.hrhappiness.entitys.userProjectCard.*;
import ru.hrhappiness.repository.SetNameProjectsRepository;
import ru.hrhappiness.repository.customers.CustomerRepository;*/




@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);


    @Bean
    CommandLineRunner initDataBaseStatusProject(StatusProjectRepository statusProjectRepository) {
        return args -> {
            log.info("Preloading " + statusProjectRepository
                    .save(new StatusProject(1, "В работе")));
            log.info("Preloading " + statusProjectRepository
                    .save(new StatusProject(2, "Черновик")));
            log.info("Preloading " + statusProjectRepository
                    .save(new StatusProject(3, "Архив")));
        };
    }


    @Bean
    CommandLineRunner initDataBaseProjectType1(WorkModelRepository workModelRepository) {
        return args -> {
            log.info("Preloading" + workModelRepository
                    .save(new WorkModel(1L, "Fix")));
            log.info("Preloading" + workModelRepository
                    .save(new WorkModel(2L, "T&M")));
        };
    }


    @Bean
    CommandLineRunner initDataBaseProjectType2(DevelopmentResultRepository developmentResultRepository) {
        return args -> {
            log.info("Preloading" + developmentResultRepository
                    .save(new DevelopmentResult(1L,"ПО")));
            log.info("Preloading" + developmentResultRepository
                    .save(new DevelopmentResult(2L,"ПАК")));
        };
    }

    @Bean
    CommandLineRunner initDataBaseProjectType3(ProductTypeRepository productTypeRepository) {
        return args -> {
            log.info("Preloading" + productTypeRepository
                    .save(new ProductType(1L,"MVP")));
            log.info("Preloading" + productTypeRepository
                    .save(new ProductType(2L,"не MVP")));
        };

    }
    @Bean
    CommandLineRunner initDataBaseProjectType4(ProjectTypeRepository projectTypeRepository) {
        return args -> {
            log.info("Preloading" + projectTypeRepository
                    .save(new ProjectType(1L,"Новый")));
            log.info("Preloading" + projectTypeRepository
                    .save(new ProjectType(2L,"Модернизированный")));
        };

    }
    @Bean
    CommandLineRunner initDataBaseStageProject(StageProjectRepository stageProjectRepository){
        return args -> {
            log.info("Preloading" + stageProjectRepository
                    .save(new StageProject(1L,"Инициация")));
            log.info("Preloading" + stageProjectRepository
                    .save(new StageProject(2L,"Начало")));
            log.info("Preloading" + stageProjectRepository
                    .save(new StageProject(3L,"Середина")));
            log.info("Preloading" + stageProjectRepository
                    .save(new StageProject(4L,"Завершающая")));
        };
    }

    @Bean
    CommandLineRunner initDataBaseDevelopmentMethodology(DevelopmentMethodologyRepository
                                                                 developmentMethodologyRepository){
        return args -> {
            log.info("Preloading"+developmentMethodologyRepository
                    .save(new DevelopmentMethodology(1L,"Agile")));
            log.info("Preloading"+developmentMethodologyRepository
                    .save(new DevelopmentMethodology(2L,"Waterfall")));
        };
    }

    @Bean
    CommandLineRunner initDataBaseProductDevelopment(ProductDevelopmentRepository
                                                             productDevelopmentRepository){
        return args -> {
            log.info("Preloading"+productDevelopmentRepository
                    .save(new ProductDevelopment(1L,"Да")));
            log.info("Preloading"+productDevelopmentRepository
                    .save(new ProductDevelopment(2L,"Нет")));
        };

    }

    @Bean
    CommandLineRunner initDataBaseIsTestersOnProject(IsTestersOnProjectRepository
                                                             isTestersOnProjectRepository){
        return args -> {
            log.info("Preloading"+isTestersOnProjectRepository
                    .save(new IsTestersOnProject(1L,"Да")));
            log.info("Preloading"+isTestersOnProjectRepository
                    .save(new IsTestersOnProject(2L,"Нет")));
        };
    }
    @Bean
    CommandLineRunner initDataBaseIsTechnicalWritersOnProject(IsTechnicalWritersOnProjectRepository
                                                                      isTechnicalWritersOnProjectRepository) {
        return args -> {
            log.info("Preloading" + isTechnicalWritersOnProjectRepository
                    .save(new IsTechnicalWritersOnProject(1L,"Да")));
            log.info("Preloading" + isTechnicalWritersOnProjectRepository
                    .save(new IsTechnicalWritersOnProject(2L,"Нет")));
        };
    }

    @Bean
    CommandLineRunner initDataBaseLocation(LocationRepository locationRepository){
        return args -> {
            log.info("Preloading"+locationRepository
                    .save(new Location(1L,"Удаленно")));
            log.info("Preloading"+locationRepository
                    .save(new Location(2L,"В офисе")));
        };

    }

    @Bean
    CommandLineRunner initDataBaseOvertime(OvertimeRepository overtimeRepository){
        return args -> {
            log.info("Preloading"+overtimeRepository
                    .save(new Overtime(1L,"Иногда")));
            log.info("Preloading"+overtimeRepository
                    .save(new Overtime(2L,"Постоянно")));
            log.info("Preloading"+overtimeRepository
                    .save(new Overtime(3L,"Нет")));
        };
    }

    @Bean
    CommandLineRunner initDataBaseIsDocumentationOnProject(IsDocumentationOnProjectRepository
                                                                   isDocumentationOnProjectRepository){
        return args -> {
            log.info("Preloading"+isDocumentationOnProjectRepository
                    .save(new IsDocumentationOnProject(1L,"Да")));
            log.info("Preloading"+isDocumentationOnProjectRepository
                    .save(new IsDocumentationOnProject(2L,"Нет")));
        };

    }

    @Bean
    CommandLineRunner initDataBaseUserProjectCard(UserProjectCardRepository userProjectCardRepository){

        return args -> {
            log.info("Preloading"+ userProjectCardRepository
                    .save(new UserProjectCard(1,
                            "MyProject!!",
                            "name",
                            "Draft",
                            "T&M",
                            "ПАК",
                            "MVP",
                            "Модернизированный",
                            "Test",
                            "TestSubj",
                            "ProjTest",
                            "TestTasks",
                            "Середина",
                            "2021-11-30T14:45:29.000Z",
                            "technologiesTest",
                            "TestStakeHolder",
                            "Waterfall",
                            "Да",
                            "11",
                            "12",
                            "Да",
                            "Нет",
                            "12",
                            "В офисе",
                            "Test",
                            "2021-11-30T14:46:08.000Z",
                            "Постоянно",
                            "Да",
                            "Нет",
                            "test",
                            "4:20",
                            "4:21")));
        };
    }


/*    @Bean
    CommandLineRunner initDataBaseCustomer(CustomerRepository customerRepository){
        return args ->{
            log.info("Preloading"+ customerRepository
                    .save(new Customer(1L,
                            "SomeNameCompany"
                            ,"Max",
                            "Perch",
                            "Vladislavovich",
                            666L,
                            "max@emal.com")));
            log.info("Preloading"+ customerRepository
                    .save(new Customer(2L,
                            "SecondNameCompany"
                            ,"Kristina",
                            "SurnameSome",
                            "Aleksandrovna",
                            777L,
                            "kristina@emal.com")));
            log.info("Preloading"+ customerRepository
                    .save(new Customer(3L,
                            "ThirdNameCompany"
                            ,"Artem",
                            "Lalaev",
                            "Artemovich",
                            99999L,
                            "artem.artem_123@emal.com")));
        };
    }*/





}