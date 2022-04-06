package ru.gazprombank.educate.homework5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Homework5Test {

    private TestMethod calculateMiddleThreeMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework5.HomeWork");
        calculateMiddleThreeMethod = AssertUtils.getMethod(testClass,
                "middleThree",
                String.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @DisplayName("string: 12345; answer = 234")
    @Test
    void test1() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("12345");
        assertEquals("234", str, "Expected string: '234' actual " + str);
    }

    @DisplayName("string: apple; answer = ppl")
    @Test
    void test2() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("apple");
        assertEquals("ppl", str, "Expected string: 'ppl' actual " + str);
    }

    @DisplayName("string: tiger; answer = ige")
    @Test
    void test3() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("tiger");
        assertEquals("ige", str, "Expected string: 'ige' actual " + str);
    }

    @DisplayName("string: candy; answer = and")
    @Test
    void test4() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("candy");
        assertEquals("and", str, "Expected string: 'and' actual " + str);
    }

    @DisplayName("string: add; answer = add")
    @Test
    void test5() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("add");
        assertEquals("add", str, "Expected string: 'add' actual " + str);
    }

    @DisplayName("string: ad; answer = ad")
    @Test
    void test6() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("ad");
        assertEquals("ad", str, "Expected string: 'ad' actual " + str);
    }

    @DisplayName("string: a; answer = a")
    @Test
    void test7() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("a");
        assertEquals("a", str, "Expected string: 'a' actual " + str);
    }

    @DisplayName("string: ''; answer = ''")
    @Test
    void test8() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("");
        assertEquals("", str, "Expected string: '' actual " + str);
    }

    @DisplayName("string: del; answer = del")
    @Test
    void test9() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("del");
        assertEquals("del", str, "Expected string: 'del' actual " + str);
    }

    @DisplayName("string: denny; answer = enn")
    @Test
    void test10() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("denny");
        assertEquals("enn", str, "Expected string: 'enn' actual " + str);
    }

    @DisplayName("string: sfveaadelbb; answer = ad")
    @Test
    void test11() {
        String str = calculateMiddleThreeMethod.invokeStaticMethod("sfveaadelbb");
        assertEquals("aad", str, "Expected string: 'aad' actual " + str);
    }
}
