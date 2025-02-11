package com.aquarium.plantas.domain.model;

import com.aquarium.plantas.domain.service.utils.EnumUtils;

import java.util.List;

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

    public static List<KeyValuePair> toKeyValueList() {
        return EnumUtils.toKeyValueList(PlantaPlantio.class, PlantaPlantio::getDescricao);
    }
}
