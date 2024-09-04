package com.Sonatel.Gestion_de_Cotisation.service;


import com.Sonatel.Gestion_de_Cotisation.entity.Depense;
import com.Sonatel.Gestion_de_Cotisation.entity.Evenement;
import com.Sonatel.Gestion_de_Cotisation.repository.EvenementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvenementServiceImpl implements EvenementService {

    @Autowired
    private EvenementRepo evenementRepo;

    @Override
    public Evenement addEvenement(Evenement evenement) {
        return evenementRepo.save(evenement);

    }

    @Override
    public List<Evenement> listEven() {

        return evenementRepo.findAll();
    }

    @Override
    public Evenement detailEvenement (Long id) {
        Optional<Evenement> evenSearch = evenementRepo.findById(id);

        if (evenSearch.isEmpty()) {
            return null;
        }

        Evenement evenFound = evenSearch.get();

        return evenFound;
    }

    @Override
    public String deleteEven(Long id) {
        evenementRepo.deleteById(id);
        return "Supprimé";

    }
}

