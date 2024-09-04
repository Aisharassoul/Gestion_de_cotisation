package com.Sonatel.Gestion_de_Cotisation.service;

import com.Sonatel.Gestion_de_Cotisation.entity.Categorie;
import com.Sonatel.Gestion_de_Cotisation.entity.Cotisation;

import java.util.List;

public interface CotisationService {

    Cotisation addCotisation(Cotisation cotisation);

    List<Cotisation> listCot();

    Cotisation detailCotisation(Long id);

    String deleteCot(Long id);
}
