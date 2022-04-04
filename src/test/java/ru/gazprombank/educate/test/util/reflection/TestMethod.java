package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.Modifier;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMethod {
    private final Method method;
    private final String name;
    private final TestClass returnType;
    private final List<TestClass> parameters;
    private final List<Modifier> modifiers;

    public TestMethod(Method method) {
        this.method = method;
        name = this.method.getName();
        returnType = ClassCash.getTestClass(method.getReturnType());
        parameters = Stream.of(method.getParameterTypes())
                .map(ClassCash::getTestClass)
                .collect(Collectors.toUnmodifiableList());
        modifiers = Modifier.getModifiers(method);
    }
}
