package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;

import java.lang.reflect.Constructor;
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
                .map(ClassCash::getTestClass)
                .collect(Collectors.toUnmodifiableList());
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
        builder.append("['");
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        builder.append(" ").append(owner.getName()).append("(");
        StringUtils.fillBuilderWithJoin(builder, parameters, ", ");
        builder.append(")']");
        return builder.toString();
    }
}
