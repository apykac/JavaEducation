package ru.gazprombank.educate.homework18;

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

    private TestMethod calculateMatchingCharMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework18.Homework");
        calculateMatchingCharMethod = AssertUtils.getMethod(testClass,
                "matchingChar",
                int.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String[].class.getName(), String[].class.getName()));
    }

    @DisplayName("a: [\"aa\", \"bb\", \"cc\"], b: [\"aaa\", \"xx\", \"bb\"]; answer = 1")
    @Test
    void test1() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"});
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("a: [\"aa\", \"bb\", \"cc\"], b: [\"aaa\", \"b\", \"bb\"]; answer = 2")
    @Test
    void test2() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"});
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("a: [\"aa\", \"bb\", \"cc\"], b: [\"\", \"\", \"ccc\"]; answer = 1")
    @Test
    void test3() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"});
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("a: [\"\", \"\", \"ccc\"], b: [\"aa\", \"bb\", \"cc\"]; answer = 1")
    @Test
    void test4() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"", "", "ccc"}, new String[]{"aa", "bb", "cc"});
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("a: [\"\", \"\", \"\"], b: [\"\", \"bb\", \"cc\"]; answer = 0")
    @Test
    void test5() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"", "", ""}, new String[]{"", "bb", "cc"});
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("a: [\"aa\", \"bb\", \"cc\"], b: [\"\", \"\", \"\"]; answer = 0")
    @Test
    void test6() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"aa", "bb", "cc"}, new String[]{"", "", ""});
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("a: [\"aa\", \"\", \"ccc\"], b: [\"\", \"bb\", \"cc\"]; answer = 1")
    @Test
    void test7() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"aa", "", "ccc"}, new String[]{"", "bb", "cc"});
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("a: [\"x\", \"y\", \"z\"], b: [\"y\", \"z\", \"x\"]; answer = 0")
    @Test
    void test8() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"x", "y", "z"}, new String[]{"y", "z", "x"});
        assertEquals(0, fine, "Expected string: 0 actual " + fine);
    }

    @DisplayName("a: [\"\", \"y\", \"z\"], b: [\"\", \"y\", \"x\"]; answer = 1")
    @Test
    void test9() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"", "y", "z"}, new String[]{"", "y", "x"});
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }

    @DisplayName("a: [\"x\", \"y\", \"z\"], b: [\"xx\", \"yyy\", \"zzz\"]; answer = 3")
    @Test
    void test10() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"x", "y", "z"}, new String[]{"xx", "yyy", "zzz"});
        assertEquals(3, fine, "Expected string: 3 actual " + fine);
    }

    @DisplayName("a: [\"x\", \"y\", \"z\"], b: [\"xx\", \"yyy\", \"\"]; answer = 2")
    @Test
    void test11() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"x", "y", "z"}, new String[]{"xx", "yyy", ""});
        assertEquals(2, fine, "Expected string: 2 actual " + fine);
    }

    @DisplayName("a: [\"b\", \"x\", \"y\", \"z\"], b: [\"a\", \"xx\", \"yyy\", \"zzz\"]; answer = 3")
    @Test
    void test12() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"b", "x", "y", "z"}, new String[]{"a", "xx", "yyy", "zzz"});
        assertEquals(3, fine, "Expected string: 3 actual " + fine);
    }

    @DisplayName("a: [\"aaa\", \"bb\", \"c\"], b: [\"aaa\", \"xx\", \"bb\"]; answer = 1")
    @Test
    void test13() {
        int fine = calculateMatchingCharMethod.invokeStaticMethod(new String[]{"aaa", "bb", "c"}, new String[]{"aaa", "xx", "bb"});
        assertEquals(1, fine, "Expected string: 1 actual " + fine);
    }
}
