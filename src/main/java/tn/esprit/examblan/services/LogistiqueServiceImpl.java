package tn.esprit.examblan.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examblan.entities.Evenement;
import tn.esprit.examblan.entities.Logistique;
import tn.esprit.examblan.repositories.EvenementRepo;
import tn.esprit.examblan.repositories.LogistiqueRepo;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class LogistiqueServiceImpl implements ILogistiqueService {

    private final LogistiqueRepo logistiqueRepo;
    EvenementRepo evenementRepo;

    @Override
    public Logistique ajoutAffectLogEvnm(Logistique l, String descriptionEvnmt) {
        Evenement evenement = evenementRepo.chercherParNomEvenement(descriptionEvnmt);
        logistiqueRepo.save(l);
        evenement.getLogistiques().add(l);
        evenementRepo.save(evenement);
        return l;
    }

//    @Override
//    public List<Logistique> getLogistiquesDates(Date dateDeb, Date dateFin) {
//
//
//    }
}
