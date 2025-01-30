package com.aquarium.plantas.domain.service;

import com.aquarium.plantas.domain.model.Planta;
import com.aquarium.plantas.infra.repository.PlantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.Optional;
import java.util.UUID;

@Service
public class PlantaService {

    @Autowired
    private PlantaRepository plantaRepository;

    public Page<Planta> findAll(Pageable pageable) {
        return plantaRepository.findAll(pageable);
    }

    public Optional<Planta> findById(UUID id) {
        return plantaRepository.findById(id);
    }

    public Planta save(Planta planta) {
        return plantaRepository.saveAndFlush(planta);
    }

    public void deleteById(UUID id) {
        plantaRepository.deleteById(id);
    }
}
