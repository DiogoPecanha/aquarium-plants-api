package com.aquarium.plantas.domain.model;

import com.aquarium.plantas.domain.service.utils.EnumUtils;

import java.util.List;

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

    public static List<KeyValuePair> toKeyValueList() {
        return EnumUtils.toKeyValueList(PlantaEstrutura.class, PlantaEstrutura::getDescricao);
    }
}
