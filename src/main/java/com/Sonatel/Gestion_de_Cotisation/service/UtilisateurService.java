package com.Sonatel.Gestion_de_Cotisation.service;

import com.Sonatel.Gestion_de_Cotisation.entity.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    Utilisateur addUtilisateur(Utilisateur utilisateur);

    List<Utilisateur> listUser();

    Utilisateur detailUtilisateur(Long id);

     String deleteUser(Long id);




}
