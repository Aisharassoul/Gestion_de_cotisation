package com.Sonatel.Gestion_de_Cotisation.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Categorie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

//    @OneToMany(mappedBy = "categorie", fetch = FetchType.EAGER)
//    private Set<Depense> depenses;

//    @OneToMany(mappedBy = "categorie", fetch = FetchType.LAZY)
//    private Set<Cotisation> cotisations;

    @OneToMany(mappedBy = "categorie")
    @JsonManagedReference
    private List<Cotisation> cotisations = new ArrayList<>();
}
