package ru.gazprombank.educate.test.util.reflection;

import java.util.HashMap;
import java.util.Map;

public final class ClassCash {
    private static final Map<String, TestClass> CLASS_MAP = new HashMap<>();

    public synchronized static void putClass(TestClass testClass) {
        CLASS_MAP.put(testClass.getName(), testClass);
    }

    public synchronized static TestClass getClass(String className) {
        return CLASS_MAP.get(className);
    }

    public static TestClass getTestClass(Class<?> clazz) {
        TestClass testClass = ClassCash.getClass(clazz.getName());
        if (testClass == null) {
            testClass = new TestClass(clazz);
        }
        return testClass;
    }
}
