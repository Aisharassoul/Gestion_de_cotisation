package com.Sonatel.Gestion_de_Cotisation.service;


import com.Sonatel.Gestion_de_Cotisation.entity.Categorie;
import com.Sonatel.Gestion_de_Cotisation.entity.Cotisation;
import com.Sonatel.Gestion_de_Cotisation.repository.CategorieRepo;
import com.Sonatel.Gestion_de_Cotisation.repository.CotisationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CotisationServiceImpl implements CotisationService{


    @Autowired
    private CotisationRepo cotisationRepo;

    @Override
    public Cotisation addCotisation(Cotisation cotisation) {
        return cotisationRepo.save(cotisation);

    }

    @Override
    public List<Cotisation> listCot() {
        return cotisationRepo.findAll();
    }

    @Override
    public Cotisation detailCotisation(Long id) {
        Optional<Cotisation> cotSearch = cotisationRepo.findById(id);

        if (cotSearch.isEmpty()) {
            return null;
        }

        Cotisation cotFound = cotSearch.get();

        return cotFound;
    }

    @Override
    public String deleteCot(Long id) {
        cotisationRepo.deleteById(id);
        return "Supprimé";
    }
}
