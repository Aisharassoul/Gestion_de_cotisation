package com.Sonatel.Gestion_de_Cotisation.repository;

import com.Sonatel.Gestion_de_Cotisation.entity.Cotisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CotisationRepo extends JpaRepository<Cotisation, Long> {
}
