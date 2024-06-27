package tn.esprit.examblan.services;

import tn.esprit.examblan.entities.Logistique;

import java.util.Date;
import java.util.List;

public interface ILogistiqueService {
    public Logistique ajoutAffectLogEvnm (Logistique l, String descriptionEvnmt);
   // public List<Logistique> getLogistiquesDates (Date dateDeb, Date dateFin);
}
