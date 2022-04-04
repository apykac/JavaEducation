package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.ClassNotFoundTestException;

import java.lang.reflect.Method;

public final class ReflectionUtil {
    private ReflectionUtil() {
        throw new UnsupportedOperationException();
    }

    public static Class<?> getClass(String classFullName) {
        try {
            return Class.forName(classFullName);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundTestException(e);
        }
    }
}
