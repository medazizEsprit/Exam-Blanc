package tn.esprit.examblan.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ServiceImp implements IService{
//    @Scheduled(fixedRate = 60000) // toutes les 60 secondes
//    @Scheduled(fixedDelay = 60000) // toutes les 60 secondes en tenant compte du temps d'execution
//    @Scheduled(cron = "* * * * * *")// cron="[0-59] [0-59] [0-23] [1-31] [1-12] [0-7]/[SUN-SAT]
//    void testScheduler(){
//        log.info("testScheduler");
//    }
}
