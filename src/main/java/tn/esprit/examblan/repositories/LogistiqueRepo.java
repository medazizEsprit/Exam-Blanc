package tn.esprit.examblan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.examblan.entities.Evenement;
import tn.esprit.examblan.entities.Logistique;

import java.util.List;

@Repository
public interface LogistiqueRepo extends JpaRepository<Logistique, Long> {
//    @Query("select logistique FROM Evenement evenement where evenement.dateDebut<:datdeb AND evenement.dateFin>:datfin ")
//    List<Logistique> chercherLogs(@Param("datdeb") String datdeb, @Param("datfin") String datfin);
}
