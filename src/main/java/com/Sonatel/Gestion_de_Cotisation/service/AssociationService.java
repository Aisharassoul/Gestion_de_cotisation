package com.Sonatel.Gestion_de_Cotisation.service;

import com.Sonatel.Gestion_de_Cotisation.entity.Association;
import com.Sonatel.Gestion_de_Cotisation.entity.Categorie;

import java.util.List;

public interface AssociationService {

    Association addAssociation(Association association);

   List<Association> listAss();

    Association detailAssociation(Long id);

    String deleteAss(Long id);

    Association updateAss(Long id, Association association);

}
