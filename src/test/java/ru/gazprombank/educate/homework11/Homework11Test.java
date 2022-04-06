package ru.gazprombank.educate.homework11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Homework11Test {

    private TestMethod calculateFizzyWizzyMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework11.HomeWork");
        calculateFizzyWizzyMethod = AssertUtils.getMethod(testClass,
                "fizzyWizzy",
                String.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int.class.getName()));
    }

    @DisplayName("n: 1; answer = 1!")
    @Test
    void test1() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(1);
        assertEquals("1!", fine, "Expected string: '1!' actual " + fine);
    }

    @DisplayName("n: 2; answer = 2!")
    @Test
    void test2() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(2);
        assertEquals("2!", fine, "Expected string: '2!' actual " + fine);
    }

    @DisplayName("n: 3; answer = Fizz!")
    @Test
    void tes31() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(3);
        assertEquals("Fizz!", fine, "Expected string: 'Fizz!' actual " + fine);
    }

    @DisplayName("n: 4; answer = 4!")
    @Test
    void test4() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(4);
        assertEquals("4!", fine, "Expected string: '4!' actual " + fine);
    }

    @DisplayName("n: 5; answer = Buzz!")
    @Test
    void test5() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(5);
        assertEquals("Buzz!", fine, "Expected string: 'Buzz!' actual " + fine);
    }

    @DisplayName("n: 6; answer = Fizz!")
    @Test
    void test6() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(6);
        assertEquals("Fizz!", fine, "Expected string: 'Fizz!' actual " + fine);
    }

    @DisplayName("n: 7; answer = 7!")
    @Test
    void test7() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(7);
        assertEquals("7!", fine, "Expected string: '7!' actual " + fine);
    }

    @DisplayName("n: 8; answer = 8!")
    @Test
    void test8() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(8);
        assertEquals("8!", fine, "Expected string: '8!' actual " + fine);
    }

    @DisplayName("n: 9; answer = Fizz!")
    @Test
    void test9() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(9);
        assertEquals("Fizz!", fine, "Expected string: 'Fizz!' actual " + fine);
    }

    @DisplayName("n: 15; answer = FizzBuzz!")
    @Test
    void test10() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(15);
        assertEquals("FizzBuzz!", fine, "Expected string: 'FizzBuzz!' actual " + fine);
    }

    @DisplayName("n: 16; answer = 16!")
    @Test
    void test11() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(16);
        assertEquals("16!", fine, "Expected string: '16!' actual " + fine);
    }

    @DisplayName("n: 18; answer = Fizz!")
    @Test
    void test12() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(18);
        assertEquals("Fizz!", fine, "Expected string: 'Fizz!' actual " + fine);
    }

    @DisplayName("n: 19; answer = 19!")
    @Test
    void test13() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(19);
        assertEquals("19!", fine, "Expected string: '19!' actual " + fine);
    }

    @DisplayName("n: 21; answer = Fizz!")
    @Test
    void test14() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(21);
        assertEquals("Fizz!", fine, "Expected string: 'Fizz!' actual " + fine);
    }

    @DisplayName("n: 44; answer = 44!")
    @Test
    void test15() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(44);
        assertEquals("44!", fine, "Expected string: '44!' actual " + fine);
    }

    @DisplayName("n: 45; answer = FizzBuzz!")
    @Test
    void test16() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(45);
        assertEquals("FizzBuzz!", fine, "Expected string: 'FizzBuzz!' actual " + fine);
    }

    @DisplayName("n: 100; answer = Buzz!")
    @Test
    void test17() {
        String fine = calculateFizzyWizzyMethod.invokeStaticMethod(100);
        assertEquals("Buzz!", fine, "Expected string: 'Buzz!' actual " + fine);
    }
}
