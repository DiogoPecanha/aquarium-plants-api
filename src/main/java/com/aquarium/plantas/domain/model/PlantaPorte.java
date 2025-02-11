package com.aquarium.plantas.domain.model;

import com.aquarium.plantas.domain.service.utils.EnumUtils;

import java.util.List;

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

    public static List<KeyValuePair> toKeyValueList() {
        return EnumUtils.toKeyValueList(PlantaPorte.class, PlantaPorte::getDescricao);
    }
}
