package com.aquarium.plantas.api.controller;

import com.aquarium.plantas.domain.model.Planta;
import com.aquarium.plantas.domain.service.PlantaService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.Logger;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/plantas")
public class PlantaController {

    private static final Logger logger = LogManager.getLogger(PlantaController.class);

    @Autowired
    private PlantaService plantaService;

    public ResponseEntity<Page<Planta>> getAllPlantas(@RequestParam(defaultValue = "0") Integer page,
                                                      @RequestParam(defaultValue = "10") Integer size,
                                                      @RequestParam(defaultValue = "id,asc") String sort) {
        logger.info("GET /api/v1/plantas - page: {}, size: {}, sort: {}", page, size, sort);

        Pageable pageable = PageRequest.of(page, size, Sort.by(sort));
        return ResponseEntity.ok(plantaService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Planta> getPlantaById(@PathVariable UUID id) {
        logger.info("Fetching planta with id {}", id);

        return plantaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
