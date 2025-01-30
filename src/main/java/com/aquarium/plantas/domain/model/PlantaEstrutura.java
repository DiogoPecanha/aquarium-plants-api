package com.aquarium.plantas.domain.model;

public enum PlantaEstrutura {
    RIZOMA("Rizoma"),
    CAULE("Caule"),
    HASTE("Haste"),
    MUSGO("Musgo"),
    FLUTUANTE("Flutuante"),
    ROSETAS("Rosetas");

    private final String descricao;

    PlantaEstrutura(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
