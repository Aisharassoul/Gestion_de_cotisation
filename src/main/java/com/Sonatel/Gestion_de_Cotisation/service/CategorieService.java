package com.Sonatel.Gestion_de_Cotisation.service;

import com.Sonatel.Gestion_de_Cotisation.entity.Categorie;
import com.Sonatel.Gestion_de_Cotisation.entity.Utilisateur;

import java.util.List;

public interface CategorieService {

    Categorie addCategorie(Categorie categorie);

   List<Categorie> listCat();

   Categorie detailCategorie(Long id);

   String deleteCat(Long id);
}
