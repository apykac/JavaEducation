package ru.gazprombank.educate.test.util.reflection;

import ru.gazprombank.educate.test.util.exception.ClassNotFoundTestException;

import java.util.HashMap;
import java.util.Map;

public final class ClassCash {
    private static final Map<String, TestClass> CLASS_MAP = new HashMap<>();

    private ClassCash() {
        throw new UnsupportedOperationException();
    }

    public synchronized static void putClass(TestClass testClass) {
        CLASS_MAP.put(testClass.getName(), testClass);
    }

    public synchronized static TestClass getClass(Class<?> clazz) {
        if (clazz == null) {
            throw new ClassNotFoundTestException("Class for found must be not null");
        }
        TestClass testClass = CLASS_MAP.get(clazz.getName());
        if (testClass == null) {
            testClass = new TestClass(clazz);
            CLASS_MAP.put(testClass.getName(), testClass);
        }
        return testClass;
    }

    public synchronized static TestClass getClass(String classFullName) {
        if (classFullName == null || classFullName.isBlank()) {
            throw new ClassNotFoundTestException("Class for found must be not null");
        }
        TestClass testClass = CLASS_MAP.get(classFullName);
        if (testClass == null) {
            testClass = new TestClass(classFullName);
            CLASS_MAP.put(testClass.getName(), testClass);
        }
        return testClass;
    }
}
