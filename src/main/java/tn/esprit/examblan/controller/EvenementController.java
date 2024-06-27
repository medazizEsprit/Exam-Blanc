package tn.esprit.examblan.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examblan.entities.Evenement;
import tn.esprit.examblan.entities.Participant;
import tn.esprit.examblan.services.IEvenementService;
import tn.esprit.examblan.services.IParticipantService;

@RestController
@AllArgsConstructor
@RequestMapping("/evenement")
public class EvenementController {
    IEvenementService evenementService;
    @PostMapping("/ajout")
    public Evenement ajouterEvenement(@RequestBody Evenement evenement) {
        return evenementService.ajoutAffectEvenParticip(evenement);
    }
}
