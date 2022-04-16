package ru.gazprombank.educate.homework22;

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

    private TestMethod calculateHyphenSplitMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework22.Homework");
        calculateHyphenSplitMethod = AssertUtils.getMethod(testClass,
                "hyphenSplit",
                String.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @DisplayName("str: 'hello'; answer = 'hel-lo'")
    @Test
    void test1() {
        String fine = calculateHyphenSplitMethod.invokeStaticMethod("hello");
        assertEquals("hel-lo", fine, "Expected string: 'hel-lo' actual " + fine);
    }

    @DisplayName("str: 'xxyy'; answer = 'x-xy-y'")
    @Test
    void test2() {
        String fine = calculateHyphenSplitMethod.invokeStaticMethod("xxyy");
        assertEquals("x-xy-y", fine, "Expected string: 'x-xy-y' actual " + fine);
    }

    @DisplayName("str: 'aaaa'; answer = 'a-a-a-a'")
    @Test
    void test3() {
        String fine = calculateHyphenSplitMethod.invokeStaticMethod("aaaa");
        assertEquals("a-a-a-a", fine, "Expected string: 'a-a-a-a' actual " + fine);
    }

    @DisplayName("str: 'aaab'; answer = 'a-a-ab'")
    @Test
    void test4() {
        String fine = calculateHyphenSplitMethod.invokeStaticMethod("aaab");
        assertEquals("a-a-ab", fine, "Expected string: 'a-a-ab' actual " + fine);
    }

    @DisplayName("str: 'aa'; answer = 'a-a'")
    @Test
    void test5() {
        String fine = calculateHyphenSplitMethod.invokeStaticMethod("aa");
        assertEquals("a-a", fine, "Expected string: 'a-a' actual " + fine);
    }

    @DisplayName("str: 'a'; answer = 'a'")
    @Test
    void test6() {
        String fine = calculateHyphenSplitMethod.invokeStaticMethod("a");
        assertEquals("a", fine, "Expected string: 'a' actual " + fine);
    }

    @DisplayName("str: ''; answer = ''")
    @Test
    void test7() {
        String fine = calculateHyphenSplitMethod.invokeStaticMethod("");
        assertEquals("", fine, "Expected string: '' actual " + fine);
    }

    @DisplayName("str: 'noadjacent'; answer = 'noadjacent'")
    @Test
    void test8() {
        String fine = calculateHyphenSplitMethod.invokeStaticMethod("noadjacent");
        assertEquals("noadjacent", fine, "Expected string: 'noadjacent' actual " + fine);
    }

    @DisplayName("str: 'abba'; answer = 'ab-ba'")
    @Test
    void test9() {
        String fine = calculateHyphenSplitMethod.invokeStaticMethod("abba");
        assertEquals("ab-ba", fine, "Expected string: 'ab-ba' actual " + fine);
    }

    @DisplayName("str: 'abbba'; answer = 'ab-b-ba'")
    @Test
    void test10() {
        String fine = calculateHyphenSplitMethod.invokeStaticMethod("abbba");
        assertEquals("ab-b-ba", fine, "Expected string: 'ab-b-ba' actual " + fine);
    }
}
