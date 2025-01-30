package com.aquarium.plantas.domain.model;

public enum PlantaDificuldade {
    FACIL("Fácil"),
    MEDIO("Médio"),
    DIFICIL("Difícil");

    private final String descricao;

    PlantaDificuldade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
