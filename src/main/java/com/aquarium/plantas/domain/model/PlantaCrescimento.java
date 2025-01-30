package com.aquarium.plantas.domain.model;

public enum PlantaCrescimento  {
    LENTO("Lento"),
    MEDIO("Médio"),
    RAPIDO("Rápido");

    private final String descricao;

    PlantaCrescimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
