package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;
import ru.gazprombank.educate.test.util.exception.ClassNotFoundTestException;
import ru.gazprombank.educate.test.util.exception.FieldNotFoundTestException;
import ru.gazprombank.educate.test.util.exception.MethodNotFoundTestException;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass extends EqualsHashCodeClass<TestClass> {
    private final Class<?> clazz;
    private final String name;
    private final List<Modifier> modifiers;
    private final List<TestConstructor> constructors;
    private final List<TestField> fields;
    private final List<TestMethod> methods;

    public TestClass(String classFullName) {
        this(ReflectionUtils.getClass(classFullName));
    }

    public TestClass(Class<?> clazz) {
        this.clazz = clazz;
        this.name = parseName();
        ClassCash.putClass(this);
        if (name.startsWith("ru.gazprombank.educate.")) {
            modifiers = Modifier.getModifiers(clazz);
            constructors = Stream.of(clazz.getDeclaredConstructors())
                    .map(constructor -> new TestConstructor(this, constructor))
                    .collect(Collectors.toUnmodifiableList());
            fields = Stream.of(clazz.getDeclaredFields())
                    .map(field -> new TestField(this, field))
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

    private String parseName() {
        String currentName = clazz.getName();
        if (!currentName.startsWith("[")) {
            return currentName;
        }
        int count = currentName.lastIndexOf('[') + 1;
        if (count == currentName.length() - 1) {
            switch (currentName.charAt(count)) {
                case 'S':
                    return "short" + getAllBrackets(count);
                case 'C':
                    return "char" + getAllBrackets(count);
                case 'I':
                    return "int" + getAllBrackets(count);
                case 'J':
                    return "long" + getAllBrackets(count);
                case 'F':
                    return "float" + getAllBrackets(count);
                case 'D':
                    return "double" + getAllBrackets(count);
                case 'Z':
                    return "boolean" + getAllBrackets(count);
                default:
                    throw new ClassNotFoundTestException(currentName);
            }
        } else {
            return currentName.substring(count + 1, currentName.length() - 1) + getAllBrackets(count);
        }
    }

    private String getAllBrackets(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append("[]");
        }
        return builder.toString();
    }

    public TestMethod getMethod(String methodName,
                                TestClass returnedTypeClass,
                                List<Modifier> modifiers,
                                List<TestClass> parameterTypeClasses) {
        return methods.stream()
                .filter(method -> method.getName().equals(methodName) &&
                        method.getReturnType().equals(returnedTypeClass) &&
                        equalsLists(method.getModifiers(), modifiers) &&
                        equalsLists(method.getParameters(), parameterTypeClasses)
                )
                .findFirst()
                .orElseThrow(() -> new MethodNotFoundTestException(methodName, returnedTypeClass, modifiers, parameterTypeClasses));
    }

    public TestField getField(String fieldName,
                              List<Modifier> modifiers,
                              TestClass fieldType) {
        return fields.stream()
                .filter(field -> field.getName().equals(fieldName) &&
                        field.getType().equals(fieldType) &&
                        equalsLists(field.getModifiers(), modifiers)
                )
                .findFirst()
                .orElseThrow(() -> new FieldNotFoundTestException(fieldName, modifiers, fieldType));
    }

    public boolean instanceOf(Class<?> parent) {
        return parent.isAssignableFrom(clazz);
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

    @Override
    boolean fieldEquals(TestClass testClass) {
        return Objects.equals(clazz, testClass.clazz) &&
                Objects.equals(name, testClass.name) &&
                equalsLists(modifiers, testClass.modifiers) &&
                equalsLists(constructors, testClass.constructors) &&
                equalsLists(fields, testClass.fields) &&
                equalsLists(methods, testClass.methods);
    }

    @Override
    int calculateHashCode() {
        return Objects.hash(
                clazz,
                name,
                hashList(modifiers),
                hashList(constructors),
                hashList(fields),
                hashList(methods)
        );
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        if (modifiers != null && !modifiers.isEmpty()) {
            builder.append(' ');
        }
        builder.append(name);
        return builder.toString();
    }
}
