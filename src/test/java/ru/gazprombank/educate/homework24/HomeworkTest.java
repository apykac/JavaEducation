package ru.gazprombank.educate.homework24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTest {

    private TestMethod calculateGetMapFromStringMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework24.Homework");
        calculateGetMapFromStringMethod = AssertUtils.getMethod(testClass,
                "getMapFromString",
                Map.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @DisplayName("str: '1231241'; answer = '{1=3, 2=2, 3=1, 4=1}'")
    @Test
    void test1() {
        Map<Integer, Integer> target = new HashMap<Integer, Integer>() {{
            put(1, 3);
            put(2, 2);
            put(3, 1);
            put(4, 1);
        }};
        Map<Integer, Integer> result = calculateGetMapFromStringMethod.invokeStaticMethod("1231241");
        assertEquals(result, target, "Expected string: '{1=3, 2=2, 3=1, 4=1}' actual " + result);
    }

    @DisplayName("str: '1231aaaaa241'; answer = '{1=3, 2=2, 3=1, 4=1}'")
    @Test
    void test2() {
        Map<Integer, Integer> target = new HashMap<Integer, Integer>() {{
            put(1, 3);
            put(2, 2);
            put(3, 1);
            put(4, 1);
        }};
        Map<Integer, Integer> result = calculateGetMapFromStringMethod.invokeStaticMethod("1231aaaaa241");
        assertEquals(result, target, "Expected string: '{1=3, 2=2, 3=1, 4=1}' actual " + result);
    }

    @DisplayName("str: '1aaaaa'; answer = '{1=1}'")
    @Test
    void test3() {
        Map<Integer, Integer> target = new HashMap<Integer, Integer>() {{
            put(1, 1);
        }};
        Map<Integer, Integer> result = calculateGetMapFromStringMethod.invokeStaticMethod("1aaaaa");
        assertEquals(result, target, "Expected string: '{1=1}' actual " + result);
    }

    @DisplayName("str: 'aaaaa'; answer = '{}'")
    @Test
    void test4() {
        Map<Integer, Integer> target = new HashMap<Integer, Integer>();
        Map<Integer, Integer> result = calculateGetMapFromStringMethod.invokeStaticMethod("aaaaa");
        assertEquals(result, target, "Expected string: '{}' actual " + result);
    }

    @DisplayName("str: '123192386486587472986438258346242374575862934276549872241'; " +
                 "answer = '{1=3, 2=10, 3=6, 4=9, 5=5, 6=6, 7=6, 8=8, 9=4}'")
    @Test
    void test5() {
        Map<Integer, Integer> target = new HashMap<Integer, Integer>() {{
            put(1, 3);
            put(2, 10);
            put(3, 6);
            put(4, 9);
            put(5, 5);
            put(6, 6);
            put(7, 6);
            put(8, 8);
            put(9, 4);
        }};
        Map<Integer, Integer> result = calculateGetMapFromStringMethod.invokeStaticMethod("123192386486587472986438258346242374575862934276549872241");
        assertEquals(result, target, "Expected string: '{1=3, 2=10, 3=6, 4=9, 5=5, 6=6, 7=6, 8=8, 9=4}' actual " + result);
    }

    @DisplayName("str: ''; answer = '{}'")
    @Test
    void test6() {
        Map<Integer, Integer> target = new HashMap<Integer, Integer>();
        Map<Integer, Integer> result = calculateGetMapFromStringMethod.invokeStaticMethod("");
        assertEquals(result, target, "Expected string: '{}' actual " + result);
    }

    @DisplayName("str: '-1-2-3-4/*-*/-*/`-*/-/1'; answer = '{1=2, 2=1, 3=1, 4=1}'")
    @Test
    void test7() {
        Map<Integer, Integer> target = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 1);
            put(3, 1);
            put(4, 1);
        }};
        Map<Integer, Integer> result = calculateGetMapFromStringMethod.invokeStaticMethod("-1-2-3-4/*-*/-*/`-*/-/1");
        assertEquals(result, target, "Expected string: '{1=2, 2=1, 3=1, 4=1}' actual " + result);
    }
}
