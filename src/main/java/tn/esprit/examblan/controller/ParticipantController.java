package tn.esprit.examblan.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examblan.entities.Participant;
import tn.esprit.examblan.services.*;

@RestController
@AllArgsConstructor
@RequestMapping("/participant")
public class ParticipantController {
    IParticipantService participantService;
    @PostMapping("/ajout")
    public Participant ajouterParticipant(@RequestBody Participant participant) {
        return participantService.ajouterParticipant(participant);
    }
}
