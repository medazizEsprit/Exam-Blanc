package tn.esprit.examblan.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examblan.entities.Logistique;
import tn.esprit.examblan.services.ILogistiqueService;
import tn.esprit.examblan.services.LogistiqueServiceImpl;

@RestController
@AllArgsConstructor
@RequestMapping("/logistique")
public class LogistiqueController {
    ILogistiqueService logistiqueService;
    @PostMapping("/ajout/{description}")
    public Logistique ajoutAffectLogEvnm (@RequestBody Logistique l,@PathVariable("description") String descriptionEvnmt){
        return logistiqueService.ajoutAffectLogEvnm(l, descriptionEvnmt);
    }
}
