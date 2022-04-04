package ru.gazprombank.educate.test.util.reflection;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestConstructor {
    private final Constructor<?> constructor;
    private final List<TestClass> parameters;

    public TestConstructor(Constructor<?> constructor) {
        this.constructor = constructor;
        this.parameters = Stream.of(this.constructor.getParameterTypes())
                .map(ClassCash::getTestClass)
                .collect(Collectors.toUnmodifiableList());
    }
}
