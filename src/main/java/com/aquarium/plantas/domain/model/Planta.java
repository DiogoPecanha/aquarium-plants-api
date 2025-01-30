package com.aquarium.plantas.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nomePopular;
    private String nomeCientifico;
    private String nomeOutros;
    private String familia;
    @Enumerated(EnumType.STRING)
    private PlantaEstrutura estrutura;
    private String origem;
    @Enumerated(EnumType.STRING)
    private PlantaCrescimento crescimento;
    @Enumerated(EnumType.STRING)
    private PlantaPlantio plantio;
    private BigDecimal iluminacao;
    private BigDecimal phMin;
    private BigDecimal phMax;
    private BigDecimal temperaturaMin;
    private BigDecimal temperaturaMax;
    private BigDecimal tamanhoMin;
    private BigDecimal tamanhoMax;
    @Enumerated(EnumType.STRING)
    private PlantaPorte porte;
    @Enumerated(EnumType.STRING)
    private PlantaPosicao posicao;
    private String reproducao;
    @Enumerated(EnumType.STRING)
    private PlantaDificuldade dificuldade;
    private boolean substratoFertil;
    private boolean co2;
    private boolean emersao;
    private String observacao;
    private String referencia;
    private LocalDateTime dataCadastro;
    private boolean excluido;
}
