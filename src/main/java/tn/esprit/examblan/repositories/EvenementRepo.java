package tn.esprit.examblan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.examblan.entities.Evenement;
import tn.esprit.examblan.entities.Evenement;

import java.util.List;

@Repository
public interface EvenementRepo extends JpaRepository<Evenement, Long> {
    @Query("select evenement FROM Evenement evenement where evenement.description =:description ")
    Evenement chercherParNomEvenement(@Param("description") String description);


}
