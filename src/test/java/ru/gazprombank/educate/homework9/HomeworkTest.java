package ru.gazprombank.educate.homework9;

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

public class HomeworkTest {

    private TestMethod calculateIsOrderedMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework9.HomeWork");
        calculateIsOrderedMethod = AssertUtils.getMethod(testClass,
                "isOrdered",
                boolean.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int.class.getName(), int.class.getName(), int.class.getName(), boolean.class.getName()));
    }

    @DisplayName("first: 1, second: 2, third: 4, itsOk: false; answer = true")
    @Test
    void test1() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(1, 2, 4, false);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("first: 1, second: 1, third: 2, itsOk: true; answer = true")
    @Test
    void test2() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(1, 1, 2, true);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("first: 2, second: 3, third: 4, itsOk: false; answer = true")
    @Test
    void test3() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(2, 3, 4, false);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("first: 3, second: 2, third: 4, itsOk: true; answer = true")
    @Test
    void test4() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(3, 2, 4, true);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("first: 2, second: 4, third: 6, itsOk: true; answer = true")
    @Test
    void test5() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(2, 4, 6, true);
        assertFalse(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("first: 7, second: 9, third: 10, itsOk: false; answer = true")
    @Test
    void test6() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(7, 9, 10, false);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("first: 7, second: 5, third: 6, itsOk: true; answer = true")
    @Test
    void test7() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(7, 5, 6, true);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("first: 1, second: 2, third: 1, itsOk: false; answer = false")
    @Test
    void test8() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(1, 2, 1, false);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("first: 3, second: 2, third: 4, itsOk: false; answer = false")
    @Test
    void test9() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(3, 2, 4, false);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("first: 4, second: 2, third: 2, itsOk: true; answer = false")
    @Test
    void test10() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(4, 2, 2, true);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("first: 4, second: 5, third: 2, itsOk: true; answer = false")
    @Test
    void test11() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(4, 5, 2, true);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("first: 7, second: 5, third: 4, itsOk: true; answer = false")
    @Test
    void test12() {
        boolean fine = calculateIsOrderedMethod.invokeStaticMethod(7, 5, 4, true);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }
}
