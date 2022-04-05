package ru.gazprombank.educate.test.util.homework1;

import ru.gazprombank.educate.test.util.reflection.TestClass;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass(Test1.class.getName());
        System.out.println(testClass);
    }

    public static class Test1 {
        private String some;
        private Test1 testClass;

        public Test1(String some) {
            this.some = some;
        }

        public Test1(Test1 testClass) {
            this.testClass = testClass;
        }
    }
}
