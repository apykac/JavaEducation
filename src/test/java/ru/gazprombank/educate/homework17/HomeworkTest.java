package ru.gazprombank.educate.homework17;

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

    private TestMethod calculateWordsCountMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework17.Homework");
        calculateWordsCountMethod = AssertUtils.getMethod(testClass,
                "wordsCount",
                int.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String[].class.getName(), int.class.getName()));
    }

    @DisplayName("words: ['a', 'bb', 'b', 'ccc'], len: 1; answer = 2")
    @Test
    void test1() {
        int fine = calculateWordsCountMethod.invokeStaticMethod(new String[]{"a", "bb", "b", "ccc"}, 1);
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("words: ['a', 'bb', 'b', 'ccc'], len: 3; answer = 1")
    @Test
    void test2() {
        int fine = calculateWordsCountMethod.invokeStaticMethod(new String[]{"a", "bb", "b", "ccc"}, 3);
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("words: ['a', 'bb', 'b', 'ccc'], len: 4; answer = 0")
    @Test
    void test3() {
        int fine = calculateWordsCountMethod.invokeStaticMethod(new String[]{"a", "bb", "b", "ccc"}, 4);
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("words: ['xx', 'yyy', 'x', 'yy', 'z'], len: 1; answer = 2")
    @Test
    void test4() {
        int fine = calculateWordsCountMethod.invokeStaticMethod(new String[]{"xx", "yyy", "x", "yy", "z"}, 1);
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("words: ['xx', 'yyy', 'x', 'yy', 'z'], len: 2; answer = 2")
    @Test
    void test5() {
        int fine = calculateWordsCountMethod.invokeStaticMethod(new String[]{"xx", "yyy", "x", "yy", "z"}, 2);
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("words: ['xx', 'yyy', 'x', 'yy', 'z'], len: 3; answer = 1")
    @Test
    void test6() {
        int fine = calculateWordsCountMethod.invokeStaticMethod(new String[]{"xx", "yyy", "x", "yy", "z"}, 3);
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }
}
