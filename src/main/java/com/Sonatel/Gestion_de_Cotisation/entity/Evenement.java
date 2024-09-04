package com.Sonatel.Gestion_de_Cotisation.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Evenement {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "date")
    private String date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;

    @OneToMany(mappedBy = "evenement", fetch = FetchType.LAZY)
    private Set<Depense> depenses;

//    @OneToMany(mappedBy = "evenement", fetch = FetchType.LAZY)
//    private Set<Cotisation> cotisations;

}
