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
    private final TestClass owner;
    private final Method method;
    private final String name;
    private final TestClass returnType;
    private final List<TestClass> parameters;
    private final List<Modifier> modifiers;

    public TestMethod(TestClass owner, Method method) {
        this.owner = owner;
        this.method = method;
        name = this.method.getName();
        returnType = ClassCash.getClass(method.getReturnType());
        parameters = Stream.of(method.getParameterTypes())
                .map(ClassCash::getClass)
                .collect(Collectors.toUnmodifiableList());
        modifiers = Modifier.getModifiers(method);
    }

    public <T> T invokeStaticMethod(Object... args) throws Exception {
        return invokeStaticMethod(null, args);
    }

    public void invokeVoidMethod(Object o, Object... args) throws Exception {
        invokeVoidMethod(null, o, args);
    }

    public void invokeStaticVoidMethod(Object... args) throws Exception {
        invokeStaticVoidMethod(null, args);
    }

    public <T> T invokeMethod(Object o, Object... args) throws Exception {
        return invokeMethod(null, o, args);
    }

    public <T> T invokeStaticMethod(List<Class<? extends Exception>> exceptionClasses, Object... args) throws Exception {
        if (!modifiers.contains(Modifier.STATIC)) {
            throw new MethodInvokeTestException(owner, name, returnType, modifiers, parameters, "method not static");
        } else {
            return invokeMethod(exceptionClasses, null, args);
        }
    }

    public void invokeVoidMethod(List<Class<? extends Exception>> exceptionClasses, Object o, Object... args) throws Exception {
        if (returnType != ClassCash.getClass(void.class)) {
            throw new MethodInvokeTestException(owner, name, returnType, modifiers, parameters, "method not void");
        } else {
            invokeMethod(exceptionClasses, o, args);
        }
    }

    public void invokeStaticVoidMethod(List<Class<? extends Exception>> exceptionClasses, Object... args) throws Exception {
        if (!modifiers.contains(Modifier.STATIC) || returnType != ClassCash.getClass(void.class)) {
            throw new MethodInvokeTestException(owner, name, returnType, modifiers, parameters, "method not static void");
        } else {
            invokeMethod(exceptionClasses, null, args);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> T invokeMethod(List<Class<? extends Exception>> exceptionClasses, Object o, Object... args) throws Exception {
        try {
            return (T) method.invoke(o, args);
        } catch (InvocationTargetException e) {
            if (exceptionClasses != null &&
                    !exceptionClasses.isEmpty() &&
                    e.getCause() != null &&
                    exceptionClasses.stream().anyMatch(exceptionClass -> e.getCause().getClass() == exceptionClass)) {
                throw (Exception) e.getCause();
            } else {
                throw new MethodInvokeTestException(owner, name, returnType, modifiers, parameters, e.getMessage(), e);
            }
        } catch (Exception e) {
            throw new MethodInvokeTestException(owner, name, returnType, modifiers, parameters, e.getMessage(), e);
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
