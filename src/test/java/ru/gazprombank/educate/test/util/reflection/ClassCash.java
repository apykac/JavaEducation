package ru.gazprombank.educate.test.util.reflection;

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

    public synchronized static TestClass getClass(String className) {
        return CLASS_MAP.get(className);
    }

    public synchronized static TestClass getTestClass(Class<?> clazz) {
        return CLASS_MAP.computeIfAbsent(clazz.getName(), TestClass::new);
    }

    public synchronized static TestClass getTestClass(String classFullName) {
        return CLASS_MAP.computeIfAbsent(classFullName, TestClass::new);
    }
}
