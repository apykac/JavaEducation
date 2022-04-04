package ru.gazprombank.educate.test.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Modifier {
    PUBLIC(java.lang.reflect.Modifier::isPublic),
    PRIVATE(java.lang.reflect.Modifier::isPrivate),
    PROTECTED(java.lang.reflect.Modifier::isProtected),
    STATIC(java.lang.reflect.Modifier::isStatic),
    FINAL(java.lang.reflect.Modifier::isFinal),
    ABSTRACT(java.lang.reflect.Modifier::isAbstract);

    private final Function<Integer, Boolean> checkModifier;

    Modifier(Function<Integer, Boolean> checkModifier) {
        this.checkModifier = checkModifier;
    }

    public boolean check(Class<?> clazz) {
        return clazz != null && checkModifier.apply(clazz.getModifiers());
    }

    public boolean check(Method method) {
        return method != null && checkModifier.apply(method.getModifiers());
    }

    public boolean check(Field field) {
        return field != null && checkModifier.apply(field.getModifiers());
    }

    public static List<Modifier> getModifiers(Class<?> clazz) {
        return Stream.of(Modifier.values())
                .filter(modifier -> modifier.check(clazz))
                .collect(Collectors.toList());
    }

    public static List<Modifier> getModifiers(Field field) {
        return Stream.of(Modifier.values())
                .filter(modifier -> modifier.check(field))
                .collect(Collectors.toList());
    }

    public static List<Modifier> getModifiers(Method method) {
        return Stream.of(Modifier.values())
                .filter(modifier -> modifier.check(method))
                .collect(Collectors.toList());
    }
}
