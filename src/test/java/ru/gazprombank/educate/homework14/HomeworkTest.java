package ru.gazprombank.educate.homework14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTest {

    private TestMethod calculatePartialSumMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework14.Homework");
        calculatePartialSumMethod = AssertUtils.getMethod(testClass,
                "partialSum",
                int.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int.class.getName(), int.class.getName(), int.class.getName()));
    }

    @DisplayName("a: 1, b: 2, c: 3; answer = 6")
    @Test
    void test1() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(1, 2, 3);
        assertEquals(6, fine, "Expected string: 6 actual " + fine);
    }

    @DisplayName("a: 1, b: 2, c: 13; answer = 3")
    @Test
    void test2() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(1, 2, 13);
        assertEquals(3, fine, "Expected string: 3 actual " + fine);
    }

    @DisplayName("a: 1, b: 13, c: 3; answer = 1")
    @Test
    void test3() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(1, 13, 3);
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("a: 1, b: 13, c: 13; answer = 1")
    @Test
    void test4() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(1, 13, 13);
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("a: 6, b: 5, c: 2; answer = 13")
    @Test
    void test5() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(6, 5, 2);
        assertEquals(13, fine, "Expected string: 13 actual " + fine);
    }

    @DisplayName("a: 13, b: 2, c: 3; answer = 0")
    @Test
    void test6() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(13, 2, 3);
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("a: 13, b: 2, c: 13; answer = 0")
    @Test
    void test7() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(13, 2, 13);
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("a: 13, b: 13, c: 2; answer = 0")
    @Test
    void test8() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(13, 13, 2);
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("a: 9, b: 4, c: 13; answer = 13")
    @Test
    void test9() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(9, 4, 13);
        assertEquals(13, fine, "Expected string: 13 actual " + fine);
    }

    @DisplayName("a: 8, b: 13, c: 2; answer = 8")
    @Test
    void test10() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(8, 13, 2);
        assertEquals(8, fine, "Expected string: 8 actual " + fine);
    }

    @DisplayName("a: 7, b: 2, c: 1; answer = 10")
    @Test
    void test11() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(7, 2, 1);
        assertEquals(10, fine, "Expected string: 10 actual " + fine);
    }

    @DisplayName("a: 3, b: 3, c: 13; answer = 6")
    @Test
    void test12() {
        int fine = calculatePartialSumMethod.invokeStaticMethod(3, 3, 13);
        assertEquals(6, fine, "Expected string: 6 actual " + fine);
    }
}
