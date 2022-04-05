package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMethod extends EqualsHashCodeClass<TestMethod> {
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

    public String getName() {
        return name;
    }

    public TestClass getReturnType() {
        return returnType;
    }

    public List<TestClass> getParameters() {
        return parameters;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    @Override
    boolean fieldEquals(TestMethod that) {
        return Objects.equals(method, that.method) &&
                Objects.equals(name, that.name) &&
                Objects.equals(returnType, that.returnType) &&
                equalsLists(parameters, that.parameters) &&
                equalsLists(modifiers, that.modifiers);
    }

    @Override
    int calculateHashCode() {
        return Objects.hash(
                method,
                name,
                returnType,
                hashList(parameters),
                hashList(modifiers)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestMethod that = (TestMethod) o;
        return Objects.equals(method, that.method) && Objects.equals(name, that.name) && Objects.equals(returnType, that.returnType) && Objects.equals(parameters, that.parameters) && Objects.equals(modifiers, that.modifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, name, returnType, parameters, modifiers);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("'[");
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        builder.append(' ').append(name).append('(');
        StringUtils.fillBuilderWithJoin(builder, parameters, ", ");
        builder.append(")']");
        return builder.toString();
    }
}
