package com.Sonatel.Gestion_de_Cotisation.service;


import com.Sonatel.Gestion_de_Cotisation.entity.Categorie;
import com.Sonatel.Gestion_de_Cotisation.repository.CategorieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieServiceImpl implements CategorieService {


    @Autowired
    private CategorieRepo categorieRepo;

    @Override
    public Categorie addCategorie(Categorie categorie) {
        return categorieRepo.save(categorie);

    }

    @Override
    public List<Categorie> listCat() {
        return categorieRepo.findAll();
    }

    @Override
    public Categorie detailCategorie(Long id) {
        Optional<Categorie> catSearch = categorieRepo.findById(id);

        if (catSearch.isEmpty()) {
            return null;
        }

        Categorie catFound = catSearch.get();

        return catFound;
    }

    @Override
    public String deleteCat(Long id) {
        categorieRepo.deleteById(id);
        return "Supprimé";


    }


}
