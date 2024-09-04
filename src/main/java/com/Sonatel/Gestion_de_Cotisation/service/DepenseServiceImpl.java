package com.Sonatel.Gestion_de_Cotisation.service;


import com.Sonatel.Gestion_de_Cotisation.entity.Categorie;
import com.Sonatel.Gestion_de_Cotisation.entity.Cotisation;
import com.Sonatel.Gestion_de_Cotisation.entity.Depense;
import com.Sonatel.Gestion_de_Cotisation.repository.CotisationRepo;
import com.Sonatel.Gestion_de_Cotisation.repository.DepenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepenseServiceImpl implements DepenseService{

    @Autowired
    private DepenseRepo depenseRepo;

    @Override
    public Depense addDepense(Depense depense) {
        return depenseRepo.save(depense);

    }

    @Override
    public List<Depense> listDep() {

        return depenseRepo.findAll();
    }

    @Override
    public Depense detailDepense (Long id) {
        Optional<Depense> depSearch = depenseRepo.findById(id);

        if (depSearch.isEmpty()) {
            return null;
        }

        Depense depFound = depSearch.get();

        return depFound;
    }

    @Override
    public String deleteDep(Long id) {
        depenseRepo.deleteById(id);
        return "Supprimé";


    }
}
