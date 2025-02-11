package com.aquarium.plantas.domain.model;

import lombok.Getter;

public class KeyValuePair {
    @Getter
    private final String key;

    @Getter
    private final String value;

    public KeyValuePair(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
