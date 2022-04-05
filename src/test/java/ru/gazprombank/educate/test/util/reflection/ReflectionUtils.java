package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.exception.ClassNotFoundTestException;

public final class ReflectionUtils {
    private ReflectionUtils() {
        throw new UnsupportedOperationException();
    }

    public static Class<?> getClass(String classFullName) {
        try {
            return Class.forName(classFullName);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundTestException(classFullName);
        }
    }
}
