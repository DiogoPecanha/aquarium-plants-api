package com.aquarium.plantas.domain.service.utils;

import com.aquarium.plantas.domain.model.KeyValuePair;

import java.util.Arrays;
import java.util.List;

public class EnumUtils {
    public static <E extends Enum<E>> List<KeyValuePair> toKeyValueList(Class<E> enumClass,
                                                                       java.util.function.Function<E, String> descriptionGetter) {
       return Arrays.stream(enumClass.getEnumConstants())
                    .map(enumConstant -> new KeyValuePair(enumConstant.name(), descriptionGetter.apply(enumConstant)))
                    .toList();
    }
}
