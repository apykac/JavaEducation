package ru.gazprombank.educate.homework20;

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

    private TestMethod calculateYoYoMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework20.Homework");
        calculateYoYoMethod = AssertUtils.getMethod(testClass,
                "yoYo",
                int.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @DisplayName("str: 'xxyoxx'; answer = 1")
    @Test
    void test1() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("xxyoxx");
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("str: 'yyoxyoy'; answer = 2")
    @Test
    void test2() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("yyoxyoy");
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("str: 'yo'; answer = 1")
    @Test
    void test3() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("yo");
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("str: 'yoyoy'; answer = 2")
    @Test
    void test4() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("yoyoy");
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("str: 'y'; answer = 0")
    @Test
    void test5() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("y");
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("str: ''; answer = 0")
    @Test
    void test6() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("");
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("str: 'oyoyoyoyoy'; answer = 4")
    @Test
    void test7() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("oyoyoyoyoy");
        assertEquals(4, fine, "Expected string: 4 actual " + fine);
    }

    @DisplayName("str: 'oyoyoyoyoyo'; answer = 5")
    @Test
    void test8() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("oyoyoyoyoyo");
        assertEquals(5, fine, "Expected string: 5 actual " + fine);
    }

    @DisplayName("str: 'yoAAyo12yo'; answer = 3")
    @Test
    void test9() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("yoAAyo12yo");
        assertEquals(3, fine, "Expected string: 3 actual " + fine);
    }

    @DisplayName("str: 'xyoxhxiyohhyoh'; answer = 3")
    @Test
    void test10() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("xyoxhxiyohhyoh");
        assertEquals(3, fine, "Expected string: 3 actual " + fine);
    }

    @DisplayName("str: 'yogurt'; answer = 1")
    @Test
    void test11() throws Exception {
        int fine = calculateYoYoMethod.invokeStaticMethod("yogurt");
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }
}
