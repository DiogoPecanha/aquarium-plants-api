package com.aquarium.plantas.infra.repository;

import com.aquarium.plantas.domain.model.Planta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlantaRepository extends JpaRepository<Planta, UUID> {
}
