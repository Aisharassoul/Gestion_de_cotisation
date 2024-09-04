package com.Sonatel.Gestion_de_Cotisation.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cotisation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "montant")
    private String montant;

    @Column(name = "date")
    private String date;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")  // Colonne de jointure dans la table Cotisation
    @JsonBackReference
    private Utilisateur utilisateur;

//    @ManyToOne
//    @JoinColumn(name = "association_id")
//    private Association association;

//    @ManyToOne
//    @JoinColumn(name = "evenement_id")
//    private Evenement evenement;

//    @ManyToOne
//    @JoinColumn(name = "categorie_id")
//    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    @JsonBackReference
    private Categorie categorie;


}
