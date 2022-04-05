package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;
import ru.gazprombank.educate.test.util.exception.MethodInvokeTestException;

import java.lang.reflect.InvocationTargetException;
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
        returnType = ClassCash.getClass(method.getReturnType());
        parameters = Stream.of(method.getParameterTypes())
                .map(ClassCash::getClass)
                .collect(Collectors.toUnmodifiableList());
        modifiers = Modifier.getModifiers(method);
    }

    public <T> T invokeStaticMethod(Object... args) {
        if (!modifiers.contains(Modifier.STATIC)) {
            throw new MethodInvokeTestException("Try to call static method that not static: '" + this + "'");
        } else {
            return invokeMethod(null, args);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> T invokeMethod(Object o, Object... args) {
        try {
            return (T) method.invoke(o, args);
        } catch (InvocationTargetException | IllegalAccessException | ClassCastException e) {
            throw new MethodInvokeTestException("Can't invoke method '" + this + "' cause: " + e.getMessage());
        }
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
    public String toString() {
        StringBuilder builder = new StringBuilder();
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        builder.append(' ').append(returnType).append(' ').append(name).append('(');
        StringUtils.fillBuilderWithJoin(builder, parameters, ", ");
        builder.append(')');
        return builder.toString();
    }
}
