package com.Sonatel.Gestion_de_Cotisation.service;


import com.Sonatel.Gestion_de_Cotisation.entity.Association;
import com.Sonatel.Gestion_de_Cotisation.entity.Categorie;
import com.Sonatel.Gestion_de_Cotisation.repository.AssociationRepo;
import com.Sonatel.Gestion_de_Cotisation.repository.CategorieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssociationServiceImpl implements AssociationService{
    @Override
    public Association updateAss(Long id, Association association) {

        Optional<Association> assSearch = associationRepo.findById(id);

        if (assSearch.isEmpty()) {

            return null;
        }
            Association assFound = assSearch.get();
            assFound.setNom(association.getNom());
            assFound.setDescription(association.getDescription());

        return associationRepo.save(assFound);
    }

    @Autowired
    private AssociationRepo associationRepo;

    @Override
    public Association addAssociation(Association association) {
        return associationRepo.save(association);

    }

    @Override
    public List<Association> listAss(){
        return associationRepo.findAll();
    }

    @Override
    public Association detailAssociation(Long id) {
        Optional<Association> assSearch = associationRepo.findById(id);

        if (assSearch.isEmpty()) {
            return null;
        }

        Association assFound = assSearch.get();


        return assFound;
    }

    @Override
    public String deleteAss(Long id) {
        associationRepo.deleteById(id);
        return "Supprimé";


    }

}
