package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

public class TestField extends EqualsHashCodeClass<TestField> {
    private final TestClass owner;
    private final Field field;
    private final String name;
    private final TestClass type;
    private final List<Modifier> modifiers;

    public TestField(TestClass owner, Field field) {
        this.owner = owner;
        this.field = field;
        name = this.field.getName();
        type = ClassCash.getTestClass(this.field.getType());
        modifiers = Modifier.getModifiers(field);
    }

    public String getName() {
        return name;
    }

    public TestClass getType() {
        return type;
    }

    public List<Modifier> getModifiers() {
        return modifiers;
    }

    @Override
    boolean fieldEquals(TestField testField) {
        return Objects.equals(owner, testField.owner) &&
                Objects.equals(field, testField.field) &&
                Objects.equals(name, testField.name) &&
                Objects.equals(type, testField.type) &&
                equalsLists(modifiers, testField.modifiers);
    }

    @Override
    int calculateHashCode() {
        return Objects.hash(
                owner,
                field,
                name,
                type,
                hashList(modifiers)
        );
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("['");
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        builder.append(' ').append(name).append("']");
        return builder.toString();
    }
}
