package com.Sonatel.Gestion_de_Cotisation.controller;
import com.Sonatel.Gestion_de_Cotisation.entity.Cotisation;
import com.Sonatel.Gestion_de_Cotisation.service.CotisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CotisationController {

    @Autowired
    private CotisationService cotisationService;

    @PostMapping("/Cotisation/addCot")
    public Cotisation addcot(@RequestBody Cotisation cot){

        return cotisationService.addCotisation(cot);

    }

    @GetMapping("/Cotisation/list")
    public List<Cotisation> listCot() {

        return cotisationService.listCot();
    }

    @GetMapping("/Cotisation/{id}/detail")
    public Cotisation detailCot(@PathVariable Long id){

        return cotisationService.detailCotisation(id);
    }

    @DeleteMapping("/Cotisation/{id}/delete")
    public String deleteCot(@PathVariable Long id){

        return cotisationService.deleteCot(id);
    }
}
