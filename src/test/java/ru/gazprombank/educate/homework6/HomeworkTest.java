package ru.gazprombank.educate.homework6;

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

    private TestMethod calculateSpeedingFineMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework6.Homework");
        calculateSpeedingFineMethod = AssertUtils.getMethod(testClass,
                "speedingFine",
                int.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int.class.getName(), boolean.class.getName()));
    }

    @DisplayName("speed: 60, isHoliday: false; answer = 0")
    @Test
    void test1() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(60, false);
        assertEquals(0, fine, "Expected string: '0' actual " + fine);
    }

    @DisplayName("speed: 65, isHoliday: false; answer = 100")
    @Test
    void test2() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(65, false);
        assertEquals(100, fine, "Expected string: '100' actual " + fine);
    }

    @DisplayName("speed: 65, isHoliday: true; answer = 0")
    @Test
    void test3() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(65, true);
        assertEquals(0, fine, "Expected string: '0' actual " + fine);
    }

    @DisplayName("speed: 80, isHoliday: false; answer = 100")
    @Test
    void test4() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(80, false);
        assertEquals(100, fine, "Expected string: '100' actual " + fine);
    }

    @DisplayName("speed: 85, isHoliday: false; answer = 200")
    @Test
    void test5() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(85, false);
        assertEquals(200, fine, "Expected string: '200' actual " + fine);
    }

    @DisplayName("speed: 85, isHoliday: true; answer = 100")
    @Test
    void test6() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(85, true);
        assertEquals(100, fine, "Expected string: '100' actual " + fine);
    }

    @DisplayName("speed: 70, isHoliday: false; answer = 100")
    @Test
    void test7() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(70, false);
        assertEquals(100, fine, "Expected string: '100' actual " + fine);
    }

    @DisplayName("speed: 75, isHoliday: false; answer = 100")
    @Test
    void test8() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(75, false);
        assertEquals(100, fine, "Expected string: '100' actual " + fine);
    }

    @DisplayName("speed: 75, isHoliday: true; answer = 100")
    @Test
    void test9() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(75, true);
        assertEquals(100, fine, "Expected string: '100' actual " + fine);
    }

    @DisplayName("speed: 40, isHoliday: false; answer = 0")
    @Test
    void test10() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(40, false);
        assertEquals(0, fine, "Expected string: '0' actual " + fine);
    }

    @DisplayName("speed: 40, isHoliday: true; answer = 0")
    @Test
    void test11() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(40, true);
        assertEquals(0, fine, "Expected string: '0' actual " + fine);
    }

    @DisplayName("speed: 90, isHoliday: false; answer = 200")
    @Test
    void test12() throws Exception {
        int fine = calculateSpeedingFineMethod.invokeStaticMethod(90, false);
        assertEquals(200, fine, "Expected string: '200' actual " + fine);
    }
}
