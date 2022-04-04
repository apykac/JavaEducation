package ru.gazprombank.educate.test.util.homework1;

import ru.gazprombank.educate.test.util.reflection.TestClass;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass(Test1.class.getName());
    }

    public static class Test1 {
        private String some;

        public Test1(String some) {
            this.some = some;
        }
    }
}
