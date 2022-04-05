package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.exception.ClassNotFoundTestException;

public final class ReflectionUtils {
    private ReflectionUtils() {
        throw new UnsupportedOperationException();
    }

    public static Class<?> getClass(String classFullName) {
        try {
            if ("void".equals(classFullName)) {
                return void.class;
            } else if ("short".equals(classFullName)) {
                return short.class;
            } else if ("char".equals(classFullName)) {
                return char.class;
            } else if ("int".equals(classFullName)) {
                return int.class;
            } else if ("long".equals(classFullName)) {
                return long.class;
            } else if ("float".equals(classFullName)) {
                return float.class;
            } else if ("double".equals(classFullName)) {
                return double.class;
            } else if ("boolean".equals(classFullName)) {
                return boolean.class;
            } else {
                return Class.forName(classFullName);
            }
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundTestException(classFullName);
        }
    }
}
