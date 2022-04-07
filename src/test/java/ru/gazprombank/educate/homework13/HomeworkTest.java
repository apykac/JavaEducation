package ru.gazprombank.educate.homework13;

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

    private TestMethod calculateNearestTwentyOneMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework13.HomeWork");
        calculateNearestTwentyOneMethod = AssertUtils.getMethod(testClass,
                "nearestTwentyOne",
                int.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int.class.getName(), int.class.getName()));
    }

    @DisplayName("a: 19, b: 21; answer = 21")
    @Test
    void test1() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(19, 21);
        assertEquals(21, fine, "Expected string: 21 actual " + fine);
    }

    @DisplayName("a: 21, b: 19; answer = 21")
    @Test
    void test2() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(21, 19);
        assertEquals(21, fine, "Expected string: 21 actual " + fine);
    }

    @DisplayName("a: 19, b: 22; answer = 19")
    @Test
    void test3() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(19, 22);
        assertEquals(19, fine, "Expected string: 19 actual " + fine);
    }

    @DisplayName("a: 22, b: 19; answer = 19")
    @Test
    void test4() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(22, 19);
        assertEquals(19, fine, "Expected string: 19 actual " + fine);
    }

    @DisplayName("a: 22, b: 50; answer = 0")
    @Test
    void test5() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(22, 50);
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("a: 22, b: 22; answer = 0")
    @Test
    void test6() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(22, 22);
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("a: 33, b: 1; answer = 1")
    @Test
    void test7() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(33, 1);
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("a: 1, b: 2; answer = 2")
    @Test
    void test8() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(1, 2);
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("a: 34, b: 33; answer = 0")
    @Test
    void test9() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(34, 33);
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("a: 17, b: 19; answer = 19")
    @Test
    void test10() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(17, 19);
        assertEquals(19, fine, "Expected string: 19 actual " + fine);
    }

    @DisplayName("a: 18, b: 17; answer = 18")
    @Test
    void test11() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(18, 17);
        assertEquals(18, fine, "Expected string: 18 actual " + fine);
    }

    @DisplayName("a: 16, b: 23; answer = 16")
    @Test
    void test12() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(16, 23);
        assertEquals(16, fine, "Expected string: 16 actual " + fine);
    }

    @DisplayName("a: 3, b: 4; answer = 4")
    @Test
    void test13() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(3, 4);
        assertEquals(4, fine, "Expected string: 4 actual " + fine);
    }

    @DisplayName("a: 3, b: 2; answer = 3")
    @Test
    void test14() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(3, 2);
        assertEquals(3, fine, "Expected string: 3 actual " + fine);
    }

    @DisplayName("a: 21, b: 20; answer = 21")
    @Test
    void test15() {
        int fine = calculateNearestTwentyOneMethod.invokeStaticMethod(21, 20);
        assertEquals(21, fine, "Expected string: 21 actual " + fine);
    }
}
