package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.Modifier;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
    private final Class<?> clazz;
    private final String name;
    private final List<Modifier> modifiers;
    private final List<TestConstructor> constructors;
    private final List<TestField> fields;
    private final List<TestMethod> methods;

    public TestClass(String classFullName) {
        this(ReflectionUtil.getClass(classFullName));
    }

    public TestClass(Class<?> clazz) {
        this.clazz = clazz;
        this.name = clazz.getName();
        ClassCash.putClass(this);
        if (!name.startsWith("java.")) {
            modifiers = Modifier.getModifiers(clazz);
            constructors = Stream.of(clazz.getDeclaredConstructors())
                    .map(TestConstructor::new)
                    .collect(Collectors.toUnmodifiableList());
            fields = Stream.of(clazz.getDeclaredFields())
                    .map(TestField::new)
                    .collect(Collectors.toUnmodifiableList());
            methods = Stream.of(clazz.getDeclaredMethods())
                    .map(TestMethod::new)
                    .collect(Collectors.toUnmodifiableList());
        } else {
            modifiers = Collections.emptyList();
            constructors = Collections.emptyList();
            fields = Collections.emptyList();
            methods = Collections.emptyList();
        }
    }

    public String getName() {
        return name;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    public List<TestConstructor> getConstructors() {
        return constructors;
    }

    public List<TestField> getFields() {
        return fields;
    }

    public List<TestMethod> getMethods() {
        return methods;
    }
}
