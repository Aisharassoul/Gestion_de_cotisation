package com.Sonatel.Gestion_de_Cotisation.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Depense {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "montant")
    private String montant;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "association_id")
    @JsonBackReference
    private Association association;

    @ManyToOne
    @JoinColumn(name = "evenement_id")
    private Evenement evenement;

//    @ManyToOne
//    @JoinColumn(name = "categorie_id")
//    private Categorie categorie;
}
