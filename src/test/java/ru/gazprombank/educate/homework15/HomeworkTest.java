package ru.gazprombank.educate.homework15;

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

    private TestMethod calculateRepeatCharMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework15.Homework");
        calculateRepeatCharMethod = AssertUtils.getMethod(testClass,
                "repeatChar",
                String.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @DisplayName("str: 'The'; answer = 'TThhee'")
    @Test
    void test1() {
        String fine = calculateRepeatCharMethod.invokeStaticMethod("The");
        assertEquals("TThhee", fine, "Expected string: 'TThhee' actual " + fine);
    }

    @DisplayName("str: 'AAbb'; answer = 'AAAAbbbb'")
    @Test
    void test2() {
        String fine = calculateRepeatCharMethod.invokeStaticMethod("AAbb");
        assertEquals("AAAAbbbb", fine, "Expected string: 'AAAAbbbb' actual " + fine);
    }

    @DisplayName("str: 'Hi-There'; answer = 'HHii--TThheerree'")
    @Test
    void test3() {
        String fine = calculateRepeatCharMethod.invokeStaticMethod("Hi-There");
        assertEquals("HHii--TThheerree", fine, "Expected string: 'HHii--TThheerree' actual " + fine);
    }

    @DisplayName("str: 'Word!'; answer = 'WWoorrdd!!'")
    @Test
    void test4() {
        String fine = calculateRepeatCharMethod.invokeStaticMethod("Word!");
        assertEquals("WWoorrdd!!", fine, "Expected string: 'WWoorrdd!!' actual " + fine);
    }

    @DisplayName("str: '!!'; answer = '!!!!'")
    @Test
    void test5() {
        String fine = calculateRepeatCharMethod.invokeStaticMethod("!!");
        assertEquals("!!!!", fine, "Expected string: '!!!!' actual " + fine);
    }

    @DisplayName("str: ''; answer = ''")
    @Test
    void test6() {
        String fine = calculateRepeatCharMethod.invokeStaticMethod("");
        assertEquals("", fine, "Expected string: '' actual " + fine);
    }

    @DisplayName("str: 'a'; answer = 'aa'")
    @Test
    void test7() {
        String fine = calculateRepeatCharMethod.invokeStaticMethod("a");
        assertEquals("aa", fine, "Expected string: 'aa' actual " + fine);
    }

    @DisplayName("str: '.'; answer = '..'")
    @Test
    void test8() {
        String fine = calculateRepeatCharMethod.invokeStaticMethod(".");
        assertEquals("..", fine, "Expected string: '..' actual " + fine);
    }

    @DisplayName("str: 'aa'; answer = 'aaaa'")
    @Test
    void test9() {
        String fine = calculateRepeatCharMethod.invokeStaticMethod("aa");
        assertEquals("aaaa", fine, "Expected string: 'aaaa' actual " + fine);
    }

}
