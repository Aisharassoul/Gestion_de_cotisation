package com.Sonatel.Gestion_de_Cotisation.controller;

import com.Sonatel.Gestion_de_Cotisation.entity.Utilisateur;
import com.Sonatel.Gestion_de_Cotisation.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;


    @PostMapping("/user/add")
    public Utilisateur addUser(@RequestBody Utilisateur user){

        return utilisateurService.addUtilisateur(user);

    }
    @GetMapping("/user/list")
    public List<Utilisateur> listUser() {

        return utilisateurService.listUser();
    }

    @GetMapping("/user/{id}/detail")
    public Utilisateur detailUser(@PathVariable Long id){

        return utilisateurService.detailUtilisateur(id);
    }

  @DeleteMapping("/user/{id}/delete")
    public String deleteUser(@PathVariable Long id){

        return utilisateurService.deleteUser(id);
    }


}
