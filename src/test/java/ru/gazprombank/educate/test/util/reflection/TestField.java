package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.Modifier;

import java.lang.reflect.Field;
import java.util.List;

public class TestField {
    private final Field field;
    private final String name;
    private final TestClass type;
    private final List<Modifier> modifiers;

    public TestField(Field field) {
        this.field = field;
        name = this.field.getName();
        type = ClassCash.getTestClass(this.field.getType());
        modifiers = Modifier.getModifiers(field);
    }
}
