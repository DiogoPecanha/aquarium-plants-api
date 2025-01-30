package com.aquarium.plantas.domain.model;

public enum PlantaPorte {
    PEQUENO("Pequeno"),
    MEDIO("Médio"),
    GRANDE("Grande");

    private final String descricao;

    PlantaPorte(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
