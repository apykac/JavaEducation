package ru.gazprombank.educate.test.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Modifier {
    PUBLIC("public", java.lang.reflect.Modifier::isPublic),
    PROTECTED("protected", java.lang.reflect.Modifier::isProtected),
    PRIVATE("private", java.lang.reflect.Modifier::isPrivate),
    ABSTRACT("abstract", java.lang.reflect.Modifier::isAbstract),
    STATIC("static", java.lang.reflect.Modifier::isStatic),
    FINAL("final", java.lang.reflect.Modifier::isFinal),
    TRANSIENT("transient", java.lang.reflect.Modifier::isTransient),
    VOLATILE("volatile", java.lang.reflect.Modifier::isVolatile),
    SYNCHRONIZED("synchronized", java.lang.reflect.Modifier::isSynchronized),
    NATIVE("native", java.lang.reflect.Modifier::isNative),
    DEFAULT("default", null),
    STRICTFP("strictfp", java.lang.reflect.Modifier::isStrict);

    private final String name;
    private final Function<Integer, Boolean> checkModifier;

    Modifier(String name, Function<Integer, Boolean> checkModifier) {
        this.name = name;
        this.checkModifier = checkModifier;
    }

    public static List<Modifier> modifiersToList(Modifier... modifiers) {
        return (modifiers == null ? Stream.<Modifier>empty() : Stream.of(modifiers))
                .distinct()
                .sorted(Comparator.comparingInt(Enum::ordinal))
                .collect(Collectors.toList());
    }

    public boolean check(Class<?> clazz) {
        return clazz != null && checkModifier.apply(clazz.getModifiers());
    }

    public boolean check(Constructor<?> constructor) {
        return constructor != null && checkModifier.apply(constructor.getModifiers());
    }

    public boolean check(Method method) {
        return method != null && checkModifier.apply(method.getModifiers());
    }

    public boolean check(Field field) {
        return field != null && checkModifier.apply(field.getModifiers());
    }

    public static List<Modifier> getModifiers(Class<?> clazz) {
        return Stream.of(Modifier.values())
                .filter(modifier -> modifier != DEFAULT)
                .filter(modifier -> modifier.check(clazz))
                .collect(Collectors.toList());
    }

    public static List<Modifier> getModifiers(Constructor<?> constructor) {
        return Stream.of(Modifier.values())
                .filter(modifier -> modifier != DEFAULT)
                .filter(modifier -> modifier.check(constructor))
                .collect(Collectors.toList());
    }

    public static List<Modifier> getModifiers(Field field) {
        return Stream.of(Modifier.values())
                .filter(modifier -> modifier != DEFAULT)
                .filter(modifier -> modifier.check(field))
                .collect(Collectors.toList());
    }

    public static List<Modifier> getModifiers(Method method) {
        return Stream.of(Modifier.values())
                .filter(modifier -> {
                    if (modifier == DEFAULT) {
                        return method.isDefault();
                    } else {
                        return modifier.check(method);
                    }
                })
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return name;
    }
}
