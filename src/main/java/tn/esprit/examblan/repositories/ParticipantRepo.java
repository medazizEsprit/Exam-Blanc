package tn.esprit.examblan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.examblan.entities.Participant;

@Repository
public interface ParticipantRepo extends JpaRepository<Participant, Long> {
    @Query("select participant FROM Participant participant where participant.nom =:nom and participant.prenom =:prenom")
    Participant chercherParNomParticipant(@Param("nom") String nom, @Param("prenom") String prenom);
}
