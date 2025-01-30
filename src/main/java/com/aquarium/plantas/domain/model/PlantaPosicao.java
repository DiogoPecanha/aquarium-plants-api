package com.aquarium.plantas.domain.model;

public enum PlantaPosicao  {
    FRENTE("Frente"),
    FRENTE_MEIO("Frente/Meio"),
    MEIO("Meio"),
    MEIO_FUNDO("Meio/Fundo"),
    FUNDO("Fundo"),
    FUNDO_SUPERFICIE("Fundo/Superfície"),;

    private final String descricao;

    PlantaPosicao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
