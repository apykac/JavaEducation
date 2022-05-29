package ru.gazprombank.educate.homework7;

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

    private TestMethod calculateTwoSumOneMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework7.Homework");
        calculateTwoSumOneMethod = AssertUtils.getMethod(testClass,
                "twoSumOne",
                boolean.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int.class.getName(), int.class.getName(), int.class.getName()));
    }

    @DisplayName("a: 1, b: 2, c: 3; answer = true")
    @Test
    void test1() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(1, 2, 3);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("a: 3, b: 1, c: 2; answer = true")
    @Test
    void test2() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(3, 1, 2);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("a: 3, b: 2, c: 2; answer = false")
    @Test
    void test3() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(3, 2, 2);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("a: 2, b: 3, c: 1; answer = true")
    @Test
    void test4() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(2, 3, 1);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("a: 5, b: 3, c: -2; answer = true")
    @Test
    void test5() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(5, 3, -2);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("a: 5, b: 3, c: -3; answer = false")
    @Test
    void test6() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(5, 3, -3);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("a: 2, b: 5, c: 3; answer = true")
    @Test
    void test7() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(2, 5, 3);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("a: 9, b: 5, c: 5; answer = false")
    @Test
    void test8() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(9, 5, 5);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("a: 9, b: 4, c: 5; answer = true")
    @Test
    void test9() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(9, 4, 5);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("a: 5, b: 4, c: 9; answer = true")
    @Test
    void test10() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(5, 4, 9);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("a: 3, b: 3, c: 0; answer = true")
    @Test
    void test11() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(3, 3, 0);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("a: 3, b: 3, c: 2; answer = false")
    @Test
    void test12() throws Exception {
        boolean fine = calculateTwoSumOneMethod.invokeStaticMethod(3, 3, 2);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }
}
