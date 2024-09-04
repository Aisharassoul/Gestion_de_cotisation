package com.Sonatel.Gestion_de_Cotisation.controller;
import com.Sonatel.Gestion_de_Cotisation.entity.Depense;
import com.Sonatel.Gestion_de_Cotisation.service.DepenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class DepenseController {

    @Autowired
    private DepenseService depenseService;

    @PostMapping("/Depense/addDep")
    public Depense adddep(@RequestBody Depense dep){

        return depenseService.addDepense(dep);

    }

    @GetMapping("/Depense/listDep")
    public List<Depense> listDep(){

        return depenseService.listDep();
    }

    @GetMapping("/Depense/{id}/detailDep")
    public Depense detailDep(@PathVariable Long id){

        return depenseService.detailDepense(id);
    }

    @DeleteMapping("/Depense/{id}/deleteDep")
    public String deleteDep(@PathVariable Long id){

        return depenseService.deleteDep(id);
    }



}
