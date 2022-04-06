package ru.gazprombank.educate.homework10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Homework10Test {

    private TestMethod calculateIsCoolMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework10.HomeWork");
        calculateIsCoolMethod = AssertUtils.getMethod(testClass,
                "isCool",
                boolean.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int.class.getName()));
    }

    @DisplayName("n: 22; answer = true")
    @Test
    void test1() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(22);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("n: 23; answer = true")
    @Test
    void test2() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(23);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("n: 11; answer = true")
    @Test
    void test3() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(11);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("n: 12; answer = true")
    @Test
    void test4() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(12);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("n: 0; answer = true")
    @Test
    void test5() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(0);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("n: 55; answer = true")
    @Test
    void test6() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(55);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("n: 1; answer = true")
    @Test
    void test7() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(1);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("n: 121; answer = true")
    @Test
    void test8() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(121);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("n: 122; answer = true")
    @Test
    void test9() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(122);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("n: 24; answer = false")
    @Test
    void test10() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(24);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("n: 21; answer = false")
    @Test
    void test11() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(21);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("n: 10; answer = false")
    @Test
    void test12() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(10);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("n: 9; answer = false")
    @Test
    void test13() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(9);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("n: 8; answer = false")
    @Test
    void test14() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(8);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("n: 2; answer = false")
    @Test
    void test15() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(2);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("n: 123; answer = false")
    @Test
    void test16() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(123);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("n: 46; answer = false")
    @Test
    void test17() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(46);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("n: 49; answer = false")
    @Test
    void test18() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(49);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("n: 52; answer = false")
    @Test
    void test19() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(52);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("n: 54; answer = false")
    @Test
    void test20() {
        boolean fine = calculateIsCoolMethod.invokeStaticMethod(54);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }
}
