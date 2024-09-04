package com.Sonatel.Gestion_de_Cotisation.service;

import com.Sonatel.Gestion_de_Cotisation.entity.Association;
import com.Sonatel.Gestion_de_Cotisation.entity.Depense;

import java.util.List;

public interface DepenseService {

    Depense addDepense(Depense depense);

    List<Depense> listDep();

    Depense detailDepense(Long id);

    String deleteDep(Long id);
}
