package tn.esprit.examblan.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private float cout;
    @ManyToMany( cascade = CascadeType.ALL)
    private Set<Participant> participants = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Logistique> logistiques = new HashSet<>();
}
