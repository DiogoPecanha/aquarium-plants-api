package com.aquarium.plantas.domain.model;

public enum PlantaPlantio {
    GRUPO("Grupo"),
    SOLITARIA("Solitária"),
    GRUPO_SOLITARIA("Grupo/Solitária");

    private final String descricao;

    PlantaPlantio(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
