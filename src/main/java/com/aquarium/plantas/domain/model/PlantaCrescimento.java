package com.aquarium.plantas.domain.model;

import com.aquarium.plantas.domain.service.utils.EnumUtils;

import java.util.List;

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

    public static List<KeyValuePair> toKeyValueList() {
        return EnumUtils.toKeyValueList(PlantaCrescimento.class, PlantaCrescimento::getDescricao);
    }
}
