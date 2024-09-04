package com.Sonatel.Gestion_de_Cotisation.controller;


import com.Sonatel.Gestion_de_Cotisation.entity.Association;
import com.Sonatel.Gestion_de_Cotisation.service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class AssociationController {

    @Autowired
    private AssociationService associationService;

    @PostMapping("/Association/addAss")
    public Association addass(@RequestBody Association ass){

        return associationService.addAssociation(ass);

    }

    @GetMapping("/Association/list")
    public List<Association> listAss() {

        return associationService.listAss();
    }

    @GetMapping("/Association/{id}/detail")
    public Association detailAss(@PathVariable Long id){

        return associationService.detailAssociation(id);
    }

    @DeleteMapping("/Association/{id}/delete")
    public String deleteAss(@PathVariable Long id){

        return associationService.deleteAss(id);
    }

    @PutMapping("/Association/{id}/UpdateAss")
    public Association updateAss(@PathVariable Long id, @RequestBody Association association){

        return associationService.updateAss(id,association);
    }
}
