package ru.gazprombank.educate.homework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.exception.MethodInvokeTestException;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

class HomeworkTest {
    private TestMethod calculateTriangleAreaMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework2.HomeWork");
        calculateTriangleAreaMethod = AssertUtils.getMethod(testClass,
                "calculateTriangleArea",
                double.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int.class.getName(), int.class.getName(), int.class.getName()));
    }

    @DisplayName("sides: 3, 4, 5; answer = 6")
    @Test
    void test1() {
        int area = calculateTriangleAreaMethod.invokeStaticMethod(3, 4, 5);
        assertEquals(6d, area, "Triangle area must be '6' actual: '" + area + "'");
    }

    @DisplayName("sides: 8, 4, 7; answer = 13.998")
    @Test
    void test2() {
        int area = calculateTriangleAreaMethod.invokeStaticMethod(8, 4, 7);
        assertEquals(13.998d, area, "Triangle area must be '13.998' actual: '" + area + "'");
    }

    @DisplayName("sides: 7, 18, 24; answer = 37.329")
    @Test
    void test3() {
        int area = calculateTriangleAreaMethod.invokeStaticMethod(7, 18, 24);
        assertEquals(37.329d, area, "Triangle area must be '37.329' actual: '" + area + "'");
    }

    @DisplayName("sides: 8, 100, 7; exception - triangle not exist")
    @Test
    void test4() {
        try {
            int area = calculateTriangleAreaMethod.invokeStaticMethod(8, 100, 7);
            fail("Must be exception thrown");
        } catch (MethodInvokeTestException e) {
            assertSame(TriangleExistException.class, e.getCause().getClass());
        }
    }

    @DisplayName("sides: 8, -1, 7; exception - triangle not exist")
    @Test
    void test5() {
        try {
            int area = calculateTriangleAreaMethod.invokeStaticMethod(8, -1, 7);
            fail("Must be exception thrown");
        } catch (MethodInvokeTestException e) {
            assertSame(TriangleExistException.class, e.getCause().getClass());
        }
    }

    @DisplayName("sides: 8, 0, 7; exception - triangle not exist")
    @Test
    void test6() {
        try {
            int area = calculateTriangleAreaMethod.invokeStaticMethod(8, 0, 7);
            fail("Must be exception thrown");
        } catch (MethodInvokeTestException e) {
            assertSame(TriangleExistException.class, e.getCause().getClass());
        }
    }
}
