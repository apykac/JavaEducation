package ru.gazprombank.educate.homework8;

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

    private TestMethod calculateBirdsSingingMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework8.HomeWork");
        calculateBirdsSingingMethod = AssertUtils.getMethod(testClass,
                "birdsSinging",
                boolean.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int.class.getName(), boolean.class.getName()));
    }

    @DisplayName("temp: 70, isSummer: false; answer = true")
    @Test
    void test1() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(70, false);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("temp: 95, isSummer: true; answer = true")
    @Test
    void test2() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(95, true);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("temp: 90, isSummer: false; answer = true")
    @Test
    void test3() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(90, false);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("temp: 90, isSummer: true; answer = true")
    @Test
    void test4() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(90, true);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("temp: 100, isSummer: true; answer = true")
    @Test
    void test5() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(100, true);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("temp: 60, isSummer: false; answer = true")
    @Test
    void test6() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(60, false);
        assertTrue(fine, "Expected string: 'true' actual " + fine);
    }

    @DisplayName("temp: 95, isSummer: false; answer = false")
    @Test
    void test7() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(95, false);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("temp: 50, isSummer: false; answer = false")
    @Test
    void test8() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(50, false);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("temp: 50, isSummer: true; answer = false")
    @Test
    void test9() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(50, false);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("temp: 100, isSummer: false; answer = false")
    @Test
    void test10() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(100, false);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("temp: 105, isSummer: true; answer = false")
    @Test
    void test11() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(105, false);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("temp: 59, isSummer: false; answer = false")
    @Test
    void test12() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(59, false);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }

    @DisplayName("temp: 59, isSummer: true; answer = false")
    @Test
    void test13() {
        boolean fine = calculateBirdsSingingMethod.invokeStaticMethod(59, false);
        assertFalse(fine, "Expected string: 'false' actual " + fine);
    }
}
