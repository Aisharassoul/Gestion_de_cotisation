package com.Sonatel.Gestion_de_Cotisation.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Association {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy ="association", fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<Depense> depenses;

    @OneToMany(mappedBy = "association", fetch = FetchType.LAZY)
    private Set<Evenement> evenements;

//    @OneToMany(mappedBy = "association", fetch = FetchType.LAZY)
//    private Set<Cotisation> cotisations;



}
