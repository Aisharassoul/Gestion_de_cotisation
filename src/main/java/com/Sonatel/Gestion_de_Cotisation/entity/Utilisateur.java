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
public class Utilisateur {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @OneToMany(mappedBy = "utilisateur")
    @JsonManagedReference
    private List<Cotisation> cotisations = new ArrayList<>();

    //@OneToMany(mappedBy = "utilisateur", fetch = FetchType.LAZY)
   // @JsonManagedReference
//    private Set<Cotisation> cotisations;
    //private List<Cotisation> cotisations = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_association",
            joinColumns = @JoinColumn(name = "utilisateur_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "association_id", referencedColumnName = "id")
    )
    private Set<Association> associations;





}
