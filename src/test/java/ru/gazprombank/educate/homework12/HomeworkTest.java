package ru.gazprombank.educate.homework12;

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

    private TestMethod calculateSumUniqueMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework12.Homework");
        calculateSumUniqueMethod = AssertUtils.getMethod(testClass,
                "sumUnique",
                int.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int.class.getName(), int.class.getName(), int.class.getName()));
    }

    @DisplayName("a: 1, b: 2, c: 3; answer = 6")
    @Test
    void test1() throws Exception {
        int fine = calculateSumUniqueMethod.invokeStaticMethod(1, 2, 3);
        assertEquals(6, fine, "Expected string: 6 actual " + fine);
    }

    @DisplayName("a: 3, b: 2, c: 3; answer = 2")
    @Test
    void test2() throws Exception {
        int fine = calculateSumUniqueMethod.invokeStaticMethod(3, 2, 3);
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("a: 3, b: 3, c: 3; answer = 0")
    @Test
    void test3() throws Exception {
        int fine = calculateSumUniqueMethod.invokeStaticMethod(3, 3, 3);
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("a: 9, b: 2, c: 2; answer = 9")
    @Test
    void test4() throws Exception {
        int fine = calculateSumUniqueMethod.invokeStaticMethod(9, 2, 2);
        assertEquals(9, fine, "Expected string: 9 actual " + fine);
    }

    @DisplayName("a: 2, b: 2, c: 9; answer = 9")
    @Test
    void test5() throws Exception {
        int fine = calculateSumUniqueMethod.invokeStaticMethod(2, 2, 9);
        assertEquals(9, fine, "Expected string: 9 actual " + fine);
    }

    @DisplayName("a: 2, b: 9, c: 2; answer = 9")
    @Test
    void test6() throws Exception {
        int fine = calculateSumUniqueMethod.invokeStaticMethod(2, 9, 2);
        assertEquals(9, fine, "Expected string: 9 actual " + fine);
    }

    @DisplayName("a: 2, b: 9, c: 3; answer = 14")
    @Test
    void test7() throws Exception {
        int fine = calculateSumUniqueMethod.invokeStaticMethod(2, 9, 3);
        assertEquals(14, fine, "Expected string: 14 actual " + fine);
    }

    @DisplayName("a: 4, b: 2, c: 3; answer = 9")
    @Test
    void test8() throws Exception {
        int fine = calculateSumUniqueMethod.invokeStaticMethod(4, 2, 3);
        assertEquals(9, fine, "Expected string: 9 actual " + fine);
    }

    @DisplayName("a: 1, b: 3, c: 1; answer = 3")
    @Test
    void test9() throws Exception {
        int fine = calculateSumUniqueMethod.invokeStaticMethod(1, 3, 1);
        assertEquals(3, fine, "Expected string: 3 actual " + fine);
    }
}
