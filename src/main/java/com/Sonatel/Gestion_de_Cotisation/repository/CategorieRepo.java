package com.Sonatel.Gestion_de_Cotisation.repository;

import com.Sonatel.Gestion_de_Cotisation.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepo extends JpaRepository<Categorie, Long> {
}
