package com.Sonatel.Gestion_de_Cotisation.controller;

import com.Sonatel.Gestion_de_Cotisation.entity.Categorie;
import com.Sonatel.Gestion_de_Cotisation.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @PostMapping("/Categorie/addCat")
    public Categorie addcat(@RequestBody Categorie cat){

        return categorieService.addCategorie(cat);

    }

    @GetMapping("/Categorie/list")
    public List<Categorie> listCat() {

        return categorieService.listCat();
    }

    @GetMapping("/Categorie/{id}/detail")
    public Categorie detailCat(@PathVariable Long id){

        return categorieService.detailCategorie(id);
    }

    @DeleteMapping("/Categorie/{id}/delete")
    public String deleteCat(@PathVariable Long id){

        return categorieService.deleteCat(id);
    }
}
