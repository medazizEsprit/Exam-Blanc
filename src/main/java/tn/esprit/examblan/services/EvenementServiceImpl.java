package tn.esprit.examblan.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examblan.entities.Evenement;
import tn.esprit.examblan.entities.Participant;
import tn.esprit.examblan.repositories.EvenementRepo;
import tn.esprit.examblan.repositories.ParticipantRepo;

@Service
@AllArgsConstructor
@Slf4j
public class EvenementServiceImpl implements IEvenementService{
    EvenementRepo evenementRepo;
    ParticipantRepo participantRepo;
    @Override
    public Evenement ajoutAffectEvenParticip(Evenement e) {
        for(Participant p : e.getParticipants()) {
            participantRepo.save(p);
        }
        return evenementRepo.save(e);
    }
}
