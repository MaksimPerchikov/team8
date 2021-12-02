package ru.hrhappiness.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.hrhappiness.entitys.customers.Customer;
import ru.hrhappiness.entitys.userProjectCard.*;
import ru.hrhappiness.repository.SetNameProjectsRepository;
import ru.hrhappiness.repository.customers.CustomerRepository;
import ru.hrhappiness.repository.forUPC.*;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDataBaseProjectType1(ProjectType1Repository projectType1Repository) {
        return args -> {
            log.info("Preloading" + projectType1Repository
                    .save(new ProjectType1("Fix")));
            log.info("Preloading" + projectType1Repository
                    .save(new ProjectType1("T&M")));
        };
    }

    @Bean
    CommandLineRunner initDataBaseProjectType2(ProjectType2Repository projectType2Repository) {
        return args -> {
            log.info("Preloading" + projectType2Repository
                    .save(new ProjectType2("ПО")));
            log.info("Preloading" + projectType2Repository
                    .save(new ProjectType2("ПАК")));
        };

    }

    @Bean
    CommandLineRunner initDataBaseProjectType3(ProjectType3Repository projectType3Repository) {
        return args -> {
            log.info("Preloading" + projectType3Repository
                    .save(new ProjectType3("MVP")));
            log.info("Preloading" + projectType3Repository
                    .save(new ProjectType3("не MVP")));
        };

    }

    @Bean
    CommandLineRunner initDataBaseProjectType4(ProjectType4Repository projectType4Repository) {
        return args -> {
            log.info("Preloading" + projectType4Repository
                    .save(new ProjectType4("Новый")));
            log.info("Preloading" + projectType4Repository
                    .save(new ProjectType4("Модернизированный")));
        };

    }
    @Bean
    CommandLineRunner initDataBaseStatusProject(StatusProjectRepository statusProjectRepository){
        return args -> {
            log.info("Preloading "+statusProjectRepository
                    .save(new StatusProject("В работе")));
            log.info("Preloading "+statusProjectRepository
                    .save(new StatusProject("Черновик")));
            log.info("Preloading "+statusProjectRepository
                    .save(new StatusProject("Архив")));
        };
    }

    @Bean
    CommandLineRunner initDataBaseStageProject(StageProjectRepository stageProjectRepository){
        return args -> {
            log.info("Preloading" + stageProjectRepository
                    .save(new StageProject("Инициация")));
            log.info("Preloading" + stageProjectRepository
                    .save(new StageProject("Начало")));
            log.info("Preloading" + stageProjectRepository
                    .save(new StageProject("Середина")));
            log.info("Preloading" + stageProjectRepository
                    .save(new StageProject("Завершающая")));
        };
    }

    @Bean
    CommandLineRunner initDataBaseLocation(LocationRepository locationRepository){
        return args -> {
            log.info("Preloading"+locationRepository
                    .save(new Location("Удаленно")));
            log.info("Preloading"+locationRepository
                    .save(new Location("В офисе")));
        };

    }
    @Bean
    CommandLineRunner initDataBaseOvertime(OvertimeRepository overtimeRepository){
        return args -> {
            log.info("Preloading"+overtimeRepository
                    .save(new Overtime("иногда")));
            log.info("Preloading"+overtimeRepository
                    .save(new Overtime("постоянно")));
            log.info("Preloading"+overtimeRepository
                    .save(new Overtime("нет")));
        };
    }

    @Bean
    CommandLineRunner initDataBaseDevelopmentMethodology(DevelopmentMethodologyRepository
                                                                 developmentMethodologyRepository){
        return args -> {
            log.info("Preloading"+developmentMethodologyRepository
                    .save(new DevelopmentMethodology("Agile")));
            log.info("Preloading"+developmentMethodologyRepository
                    .save(new DevelopmentMethodology("Waterfall")));
        };
    }
    @Bean
    CommandLineRunner initDataBaseProductDevelopment(ProductDevelopmentRepository
                                                             productDevelopmentRepository){
        return args -> {
            log.info("Preloading"+productDevelopmentRepository
                    .save(new ProductDevelopment("Да")));
            log.info("Preloading"+productDevelopmentRepository
                    .save(new ProductDevelopment("Нет")));
        };

    }
    @Bean
    CommandLineRunner initDataBaseIsTestersOnProject(IsTestersOnProjectRepository
                                                             isTestersOnProjectRepository){
        return args -> {
            log.info("Preloading"+isTestersOnProjectRepository
                    .save(new IsTestersOnProject("Да")));
            log.info("Preloading"+isTestersOnProjectRepository
                    .save(new IsTestersOnProject("Нет")));
        };
    }
    @Bean
    CommandLineRunner initDataBaseIsTechnicalWritersOnProject(IsTechnicalWritersOnProjectRepository
                                                              isTechnicalWritersOnProjectRepository) {
        return args -> {
            log.info("Preloading" + isTechnicalWritersOnProjectRepository
                    .save(new IsTechnicalWritersOnProject("Да")));
            log.info("Preloading" + isTechnicalWritersOnProjectRepository
                    .save(new IsTechnicalWritersOnProject("Нет")));
        };
    }

    @Bean
    CommandLineRunner initDataBaseSetNameProject(SetNameProjectsRepository
                                                 setNameProjectsRepository){
        return args -> {
            log.info("Preloading"+setNameProjectsRepository
                    .save(new SetNameProjects(1L,"FirstCompanyName")));
            log.info("Preloading"+setNameProjectsRepository
                    .save(new SetNameProjects(2L,"SecondCompanyName")));
        };
    }
}
