package com.Sonatel.Gestion_de_Cotisation.repository;

import com.Sonatel.Gestion_de_Cotisation.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {
}