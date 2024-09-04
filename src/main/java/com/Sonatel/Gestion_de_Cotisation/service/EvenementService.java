package com.Sonatel.Gestion_de_Cotisation.service;

import com.Sonatel.Gestion_de_Cotisation.entity.Depense;
import com.Sonatel.Gestion_de_Cotisation.entity.Evenement;

import java.util.List;

public interface EvenementService {

    Evenement addEvenement(Evenement evenement);

    List<Evenement> listEven();

    Evenement detailEvenement(Long id);

    String deleteEven(Long id);

}
