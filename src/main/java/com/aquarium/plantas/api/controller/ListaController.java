package com.aquarium.plantas.api.controller;

import com.aquarium.plantas.domain.model.*;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/listas")
public class ListaController {
    private static final Logger logger = LogManager.getLogger(PlantaController.class);

    @GetMapping("/planta-crescimento")
    public ResponseEntity<List<KeyValuePair>> getListPlantaCrescimento() {
        logger.info("Fetching PlantaCrescimento list");

        return ResponseEntity.ok(PlantaCrescimento.toKeyValueList());
    }

    @GetMapping("/planta-dificuldade")
    public ResponseEntity<List<KeyValuePair>> getListPlantaDificuldade() {
        logger.info("Fetching PlantaDificuldade list");

        return ResponseEntity.ok(PlantaDificuldade.toKeyValueList());
    }

    @GetMapping("/planta-estrutura")
    public ResponseEntity<List<KeyValuePair>> getListPlantaEstrutura() {
        logger.info("Fetching PlantaEstrutura list");

        return ResponseEntity.ok(PlantaEstrutura.toKeyValueList());
    }

    @GetMapping("/planta-plantio")
    public ResponseEntity<List<KeyValuePair>> getListPlantaPlantio() {
        logger.info("Fetching Plantio list");

        return ResponseEntity.ok(PlantaPlantio.toKeyValueList());
    }

    @GetMapping("/planta-porte")
    public ResponseEntity<List<KeyValuePair>> getListPlantaPorte() {
        logger.info("Fetching Porte list");

        return ResponseEntity.ok(PlantaPorte.toKeyValueList());
    }

    @GetMapping("/planta-posicao")
    public ResponseEntity<List<KeyValuePair>> getListPlantaPosicao() {
        logger.info("Fetching Posicao list");

        return ResponseEntity.ok(PlantaPosicao.toKeyValueList());
    }
}
