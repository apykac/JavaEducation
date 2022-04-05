package ru.gazprombank.educate.test.util;

import ru.gazprombank.educate.test.util.exception.ClassNotFoundTestException;
import ru.gazprombank.educate.test.util.exception.FieldNotFoundTestException;
import ru.gazprombank.educate.test.util.exception.MethodNotFoundTestException;
import ru.gazprombank.educate.test.util.reflection.ClassCash;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestField;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public final class AssertUtils {
    private AssertUtils() {
        throw new UnsupportedOperationException();
    }

    public static TestClass getClass(String classFullName) {
        try {
            return new TestClass(classFullName);
        } catch (ClassNotFoundTestException e) {
            throw throwFail(e.getMessage());
        }
    }

    public static TestMethod getMethod(TestClass clazz,
                                       String methodName,
                                       String returnedType,
                                       List<Modifier> modifiers,
                                       List<String> parameterTypes) {
        try {
            assertNotNull(clazz);
            TestClass returnedTypeClass = ClassCash.getClass(returnedType);
            modifiers = modifiers == null ? Collections.emptyList() : modifiers;
            List<TestClass> parameterTypeClasses = (parameterTypes == null ? Collections.<String>emptyList() : parameterTypes)
                    .stream()
                    .map(ClassCash::getTestClass)
                    .collect(Collectors.toList());
            return clazz.getMethod(methodName, returnedTypeClass, modifiers, parameterTypeClasses);
        } catch (ClassNotFoundTestException | MethodNotFoundTestException e) {
            throw throwFail(e.getMessage());
        }
    }

    public static TestField getField(TestClass clazz, String fieldName, List<Modifier> modifiers, String fieldType) {
        try {
            TestClass fieldTypeClass = ClassCash.getClass(fieldType);
            modifiers = modifiers == null ? Collections.emptyList() : modifiers;
            return clazz.getField(fieldName, modifiers, fieldTypeClass);
        } catch (ClassNotFoundTestException | FieldNotFoundTestException e) {
            throw throwFail(e.getMessage());
        }
    }

    private static RuntimeException throwFail(String message) {
        fail(message);
        throw new RuntimeException();
    }
}
