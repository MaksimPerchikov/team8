package ru.hrhappiness.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

 /*   @Bean
    CommandLineRunner initDatabaseFirstCell(TypeProjectFirstCellRepository typeProjectFirstCellRepository){
        return args -> {
            log.info("Preloading" + typeProjectFirstCellRepository
                    .save(new TypeProjectFirstCell(1,"firstType")));
            log.info("Preloading"+typeProjectFirstCellRepository
                    .save(new TypeProjectFirstCell(2,"secondType")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseSecondCell(TypeProjectSecondCellRepository typeProjectSecondCellRepository){
        return args -> {
            log.info("Preloading" + typeProjectSecondCellRepository
                    .save(new TypeProjectSecondCell(3,"5type")));
            log.info("Preloading"+typeProjectSecondCellRepository
                    .save(new TypeProjectSecondCell(4,"4type")));
        };
    }
    */


 /*   CommandLineRunner initDatabaseUser(UserProjectCardRepository userProjectCardRepository){
        return args -> {
            log.info(MessageFormat
                    .format("Preloading{0}", userProjectCardRepository
                            .save(new UserProjectCard(1,
                                    "Vlad",
                                    "newVladProj",

                                    ))));
        };
    }*/


}
