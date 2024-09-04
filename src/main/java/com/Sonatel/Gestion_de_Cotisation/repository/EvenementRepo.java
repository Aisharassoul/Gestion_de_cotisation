package com.Sonatel.Gestion_de_Cotisation.repository;

import com.Sonatel.Gestion_de_Cotisation.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepo extends JpaRepository<Evenement, Long> {
}
