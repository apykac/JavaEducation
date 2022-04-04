package ru.gazprombank.educate.test.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.fail;

public final class AssertUtils {
    private AssertUtils() {
        throw new UnsupportedOperationException();
    }

    public static void classExist(String classFullName) {
        try {
            Class.forName(classFullName);
        } catch (ClassNotFoundException e) {
            failClassExist(classFullName);
        }
    }

    public static void methodExist(String classFullName,
                                   String method,
                                   Class<?> returnedType,
                                   List<Modifier> modifiers,
                                   List<Class<?>> parameterTypes) {
        try {
            returnedType = returnedType == null ? void.class : returnedType;
            modifiers = modifiers == null ? Collections.emptyList() : modifiers;
            parameterTypes = parameterTypes == null ? Collections.emptyList() : parameterTypes;
            Class<?> targetClass = Class.forName(classFullName);
            Method targetMethod = targetClass.getDeclaredMethod(method, parameterTypes.toArray(new Class[0]));
            List<Modifier> notFoundModifiers = modifiers.stream()
                    .filter(modifier -> !modifier.check(targetMethod))
                    .collect(Collectors.toList());
            if (returnedType != targetMethod.getReturnType()) {
//                failMethodReturnType();
            }
            if (!notFoundModifiers.isEmpty()) {

            }
        } catch (ClassNotFoundException e) {
            failClassExist(classFullName);
        } catch (NoSuchMethodException e) {
            failMethodExist(classFullName, method, returnedType, parameterTypes);
        }
    }

    public static void fieldExist(String classFullName, String fieldName, Class<?> fieldType) {
        try {
            Class<?> targetClass = Class.forName(classFullName);
            Field targetField = targetClass.getDeclaredField(fieldName);
        } catch (ClassNotFoundException e) {
            failClassExist(classFullName);
        } catch (NoSuchFieldException e) {
            failFieldExist(classFullName, fieldName);
        }
    }

    private static void failClassExist(String classFullName) {
        fail("Class '" + classFullName + "' must be specified");
    }

    private static void failMethodExist(String classFullName,
                                        String method,
                                        Class<?> returnedType,
                                        List<Class<?>> parameterTypes) {
        StringBuilder builder = new StringBuilder("Method '")
                .append(returnedType.getName())
                .append(' ')
                .append(method)
                .append("(");
        boolean begin = true;
        for (Class<?> argType : parameterTypes) {
            if (begin) {
                builder.append(argType.getName());
                begin = false;
            } else {
                builder.append(", ").append(argType.getName());
            }
        }
        builder.append(")'").append("' not found in class '").append(classFullName).append('\'');

        fail(builder.toString());
    }

    private static void failMethodWrongModifiers(String classFullName,
                                                 String method,
                                                 List<Modifier> modifiers,
                                                 List<Class<?>> parameterTypes) {
        StringBuilder builder = new StringBuilder("Method '").append(method).append("(");
        boolean begin = true;
        for (Class<?> argType : parameterTypes) {
            if (begin) {
                builder.append(argType.getName());
                begin = false;
            } else {
                builder.append(", ").append(argType.getName());
            }
        }
        builder.append(")").append("' not found in class '").append(classFullName).append('\'');

        fail(builder.toString());
    }

    private static void failFieldExist(String classFullName, String fieldName) {
        fail("Field '" + fieldName + "' not found in class '" + classFullName + "'");
    }
}
