package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;
import ru.gazprombank.educate.test.util.exception.NewInstanceCreateTestException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestConstructor extends EqualsHashCodeClass<TestConstructor> {
    private final TestClass owner;
    private final Constructor<?> constructor;
    private final List<Modifier> modifiers;
    private final List<TestClass> parameters;

    public TestConstructor(TestClass owner, Constructor<?> constructor) {
        this.owner = owner;
        this.constructor = constructor;
        this.modifiers = Modifier.getModifiers(constructor);
        this.parameters = Stream.of(this.constructor.getParameterTypes())
                .map(ClassCash::getClass)
                .collect(Collectors.toUnmodifiableList());
    }

    public TestClass getOwner() {
        return owner;
    }

    public List<TestClass> getParameters() {
        return parameters;
    }

    public Object getInstance(Object... args) throws Exception {
        return getInstance(Collections.emptyList(), args);
    }

    public Object getInstance(List<Class<? extends Exception>> exceptionClasses, Object... args) throws Exception {
        boolean isAccessible = constructor.canAccess(null);
        try {
            if (!isAccessible) {
                constructor.setAccessible(true);
            }
            return constructor.newInstance(args);
        } catch (InvocationTargetException e) {
            if (exceptionClasses != null &&
                    !exceptionClasses.isEmpty() &&
                    e.getCause() != null &&
                    exceptionClasses.stream().anyMatch(exceptionClass -> e.getCause().getClass() == exceptionClass)) {
                throw (Exception) e.getCause();
            } else {
                throw new NewInstanceCreateTestException(owner, modifiers, parameters, e.getMessage(), e);
            }
        } catch (Exception e) {
            throw new NewInstanceCreateTestException(owner, modifiers, parameters, e.getMessage(), e);
        } finally {
            if (!isAccessible) {
                constructor.setAccessible(false);
            }
        }
    }

    @Override
    boolean fieldEquals(TestConstructor that) {
        return Objects.equals(owner, that.owner) &&
                Objects.equals(constructor, that.constructor) &&
                equalsLists(modifiers, that.modifiers) &&
                equalsLists(parameters, that.parameters);
    }

    @Override
    int calculateHashCode() {
        return Objects.hash(
                owner,
                constructor,
                hashList(modifiers),
                hashList(parameters)
        );
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        builder.append(" ").append(owner.getName()).append("(");
        StringUtils.fillBuilderWithJoin(builder, parameters, ", ");
        builder.append(')');
        return builder.toString();
    }
}
