package ru.gazprombank.educate.homework16;

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

    private TestMethod calculateStarKillMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework16.Homework");
        calculateStarKillMethod = AssertUtils.getMethod(testClass,
                "starKill",
                String.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @DisplayName("str: 'ab*cd'; answer = 'ad'")
    @Test
    void test1() {
        String fine = calculateStarKillMethod.invokeStaticMethod("ab*cd");
        assertEquals("ad", fine, "Expected string: 'ad' actual " + fine);
    }

    @DisplayName("str: 'ab**cd'; answer = 'ad'")
    @Test
    void test2() {
        String fine = calculateStarKillMethod.invokeStaticMethod("ab**cd");
        assertEquals("ad", fine, "Expected string: 'ad' actual " + fine);
    }

    @DisplayName("str: 'sm*eilly'; answer = 'silly'")
    @Test
    void test3() {
        String fine = calculateStarKillMethod.invokeStaticMethod("sm*eilly");
        assertEquals("silly", fine, "Expected string: 'silly' actual " + fine);
    }

    @DisplayName("str: 'sm*eil*ly'; answer = 'siy'")
    @Test
    void test4() {
        String fine = calculateStarKillMethod.invokeStaticMethod("sm*eil*ly");
        assertEquals("siy", fine, "Expected string: 'siy' actual " + fine);
    }

    @DisplayName("str: 'sm**eil*ly'; answer = 'siy'")
    @Test
    void test5() {
        String fine = calculateStarKillMethod.invokeStaticMethod("sm**eil*ly");
        assertEquals("siy", fine, "Expected string: 'siy' actual " + fine);
    }

    @DisplayName("str: 'sm***eil*ly'; answer = 'siy'")
    @Test
    void test6() {
        String fine = calculateStarKillMethod.invokeStaticMethod("sm***eil*ly");
        assertEquals("siy", fine, "Expected string: 'siy' actual " + fine);
    }

    @DisplayName("str: 'stringy*'; answer = 'string'")
    @Test
    void test7() {
        String fine = calculateStarKillMethod.invokeStaticMethod("stringy*");
        assertEquals("string", fine, "Expected string: 'string' actual " + fine);
    }

    @DisplayName("str: '*stringy'; answer = 'tringy'")
    @Test
    void test8() {
        String fine = calculateStarKillMethod.invokeStaticMethod("*stringy");
        assertEquals("tringy", fine, "Expected string: 'tringy' actual " + fine);
    }

    @DisplayName("str: '*str*in*gy'; answer = 'ty'")
    @Test
    void test9() {
        String fine = calculateStarKillMethod.invokeStaticMethod("*str*in*gy");
        assertEquals("ty", fine, "Expected string: 'ty' actual " + fine);
    }

    @DisplayName("str: 'abc'; answer = 'abc'")
    @Test
    void test10() {
        String fine = calculateStarKillMethod.invokeStaticMethod("abc");
        assertEquals("abc", fine, "Expected string: 'abc' actual " + fine);
    }

    @DisplayName("str: 'a*bc'; answer = 'c'")
    @Test
    void test11() {
        String fine = calculateStarKillMethod.invokeStaticMethod("a*bc");
        assertEquals("c", fine, "Expected string: 'c' actual " + fine);
    }

    @DisplayName("str: 'ab'; answer = 'ab'")
    @Test
    void test12() {
        String fine = calculateStarKillMethod.invokeStaticMethod("ab");
        assertEquals("ab", fine, "Expected string: 'ab' actual " + fine);
    }

    @DisplayName("str: 'a*b'; answer = ''")
    @Test
    void test13() {
        String fine = calculateStarKillMethod.invokeStaticMethod("a*b");
        assertEquals("", fine, "Expected string: '' actual " + fine);
    }

    @DisplayName("str: 'a'; answer = 'a'")
    @Test
    void test14() {
        String fine = calculateStarKillMethod.invokeStaticMethod("a");
        assertEquals("a", fine, "Expected string: 'a' actual " + fine);
    }

    @DisplayName("str: 'a*'; answer = ''")
    @Test
    void test15() {
        String fine = calculateStarKillMethod.invokeStaticMethod("a*");
        assertEquals("", fine, "Expected string: '' actual " + fine);
    }

    @DisplayName("str: '*a'; answer = ''")
    @Test
    void test16() {
        String fine = calculateStarKillMethod.invokeStaticMethod("*a");
        assertEquals("", fine, "Expected string: '' actual " + fine);
    }

    @DisplayName("str: '*'; answer = ''")
    @Test
    void test17() {
        String fine = calculateStarKillMethod.invokeStaticMethod("*");
        assertEquals("", fine, "Expected string: '' actual " + fine);
    }

    @DisplayName("str: ''; answer = ''")
    @Test
    void test18() {
        String fine = calculateStarKillMethod.invokeStaticMethod("");
        assertEquals("", fine, "Expected string: '' actual " + fine);
    }
}
