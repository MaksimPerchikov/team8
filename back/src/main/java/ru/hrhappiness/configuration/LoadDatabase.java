

package ru.hrhappiness.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
    CommandLineRunner initDataBaseProjectType1(ProjectType1Repository projectType1Repository) {
        return args -> {
            log.info("Preloading" + projectType1Repository
                    .save(new ProjectType1(1L, "Fix")));
            log.info("Preloading" + projectType1Repository
                    .save(new ProjectType1(2L, "T&M")));
        };
    }


    @Bean
    CommandLineRunner initDataBaseProjectType2(ProjectType2Repository projectType2Repository) {
        return args -> {
            log.info("Preloading" + projectType2Repository
                    .save(new ProjectType2(1L,"ПО")));
            log.info("Preloading" + projectType2Repository
                    .save(new ProjectType2(2L,"ПАК")));
        };

    }

    @Bean
    CommandLineRunner initDataBaseProjectType3(ProjectType3Repository projectType3Repository) {
        return args -> {
            log.info("Preloading" + projectType3Repository
                    .save(new ProjectType3(1L,"MVP")));
            log.info("Preloading" + projectType3Repository
                    .save(new ProjectType3(2L,"не MVP")));
        };

    }
    @Bean
    CommandLineRunner initDataBaseProjectType4(ProjectType4Repository projectType4Repository) {
        return args -> {
            log.info("Preloading" + projectType4Repository
                    .save(new ProjectType4(1L,"Новый")));
            log.info("Preloading" + projectType4Repository
                    .save(new ProjectType4(2L,"Модернизированный")));
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
                    .save(new Overtime(1L,"иногда")));
            log.info("Preloading"+overtimeRepository
                    .save(new Overtime(2L,"постоянно")));
            log.info("Preloading"+overtimeRepository
                    .save(new Overtime(3L,"нет")));
        };
    }

}
/*










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

*/
