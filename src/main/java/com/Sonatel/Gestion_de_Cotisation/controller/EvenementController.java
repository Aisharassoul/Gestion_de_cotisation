package com.Sonatel.Gestion_de_Cotisation.controller;
import com.Sonatel.Gestion_de_Cotisation.entity.Evenement;
import com.Sonatel.Gestion_de_Cotisation.service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class EvenementController {

    @Autowired
    private EvenementService evenementService;

    @PostMapping("/Evenement/addEven")
    public Evenement addeven(@RequestBody Evenement Even){

        return evenementService.addEvenement(Even);

    }

    @GetMapping("/Evenement/listEven")
    public List<Evenement> listEven(){

        return evenementService.listEven();
    }

    @GetMapping("/Evenement/{id}/detailEven")
    public Evenement detailEven(@PathVariable Long id){

        return evenementService.detailEvenement(id);
    }

    @DeleteMapping("/Evenement/{id}/deleteEven")
    public String deleteEven(@PathVariable Long id){

        return evenementService.deleteEven(id);
    }
}
