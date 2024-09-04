package com.Sonatel.Gestion_de_Cotisation.service;

import com.Sonatel.Gestion_de_Cotisation.entity.Utilisateur;
import com.Sonatel.Gestion_de_Cotisation.repository.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{




    @Autowired
    private UtilisateurRepo utilisateurRepo;

    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {

        return utilisateurRepo.save(utilisateur);
    }



    @Override
    public List<Utilisateur> listUser() {
        return utilisateurRepo.findAll();
    }

    @Override
    public Utilisateur detailUtilisateur(Long id) {
        Optional<Utilisateur> userSearch = utilisateurRepo.findById(id);

        if (userSearch.isEmpty()){
            return  null ;
        }

        Utilisateur userFound = userSearch.get();

        return userFound;
    }


    @Override
    public String deleteUser(Long id){
         utilisateurRepo.deleteById(id);
          return "Supprimé";


    }




}
