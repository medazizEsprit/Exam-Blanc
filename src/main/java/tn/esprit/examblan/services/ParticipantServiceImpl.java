package tn.esprit.examblan.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examblan.entities.Participant;
import tn.esprit.examblan.repositories.ParticipantRepo;

@Service
@AllArgsConstructor
@Slf4j
public class ParticipantServiceImpl implements IParticipantService{
    ParticipantRepo participantRepo;

    @Override
    public Participant ajouterParticipant(Participant p) {
        return participantRepo.save(p);
    }
}
