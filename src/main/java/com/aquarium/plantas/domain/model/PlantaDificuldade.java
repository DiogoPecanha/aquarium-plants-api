package com.aquarium.plantas.domain.model;

import com.aquarium.plantas.domain.service.utils.EnumUtils;

import java.util.List;

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

    public static List<KeyValuePair> toKeyValueList() {
        return EnumUtils.toKeyValueList(PlantaDificuldade.class, PlantaDificuldade::getDescricao);
    }
}
