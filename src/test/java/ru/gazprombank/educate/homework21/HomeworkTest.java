package ru.gazprombank.educate.homework21;

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

    private TestMethod calculateEndooMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework21.Homework");
        calculateEndooMethod = AssertUtils.getMethod(testClass,
                "endoo",
                String.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @DisplayName("str: 'oore'; answer = 'reoo'")
    @Test
    void test1() {
        String fine = calculateEndooMethod.invokeStaticMethod("oore");
        assertEquals("reoo", fine, "Expected string: 'reoo' actual " + fine);
    }

    @DisplayName("str: 'oohioo'; answer = 'hioooo'")
    @Test
    void test2() {
        String fine = calculateEndooMethod.invokeStaticMethod("oohioo");
        assertEquals("hioooo", fine, "Expected string: 'hioooo' actual " + fine);
    }

    @DisplayName("str: 'ohiohio'; answer = 'hihiooo'")
    @Test
    void test3() {
        String fine = calculateEndooMethod.invokeStaticMethod("ohiohio");
        assertEquals("hihiooo", fine, "Expected string: 'hihiooo' actual " + fine);
    }

    @DisplayName("str: 'hiy'; answer = 'hiy'")
    @Test
    void test4() {
        String fine = calculateEndooMethod.invokeStaticMethod("hiy");
        assertEquals("hiy", fine, "Expected string: 'hiy' actual " + fine);
    }

    @DisplayName("str: 'h'; answer = 'h'")
    @Test
    void test5() {
        String fine = calculateEndooMethod.invokeStaticMethod("h");
        assertEquals("h", fine, "Expected string: 'h' actual " + fine);
    }

    @DisplayName("str: ''; answer = ''")
    @Test
    void test6() {
        String fine = calculateEndooMethod.invokeStaticMethod("");
        assertEquals("", fine, "Expected string: '' actual " + fine);
    }

    @DisplayName("str: 'o'; answer = 'o'")
    @Test
    void test7() {
        String fine = calculateEndooMethod.invokeStaticMethod("o");
        assertEquals("o", fine, "Expected string: 'o' actual " + fine);
    }

    @DisplayName("str: 'oo'; answer = 'oo'")
    @Test
    void test8() {
        String fine = calculateEndooMethod.invokeStaticMethod("oo");
        assertEquals("oo", fine, "Expected string: 'oo' actual " + fine);
    }

    @DisplayName("str: 'boo'; answer = 'boo'")
    @Test
    void test9() {
        String fine = calculateEndooMethod.invokeStaticMethod("boo");
        assertEquals("boo", fine, "Expected string: 'boo' actual " + fine);
    }

    @DisplayName("str: 'boao'; answer = 'baoo'")
    @Test
    void test10() {
        String fine = calculateEndooMethod.invokeStaticMethod("boao");
        assertEquals("baoo", fine, "Expected string: 'baoo' actual " + fine);
    }

    @DisplayName("str: 'aoaoao'; answer = 'aaaooo'")
    @Test
    void test11() {
        String fine = calculateEndooMethod.invokeStaticMethod("aoaoao");
        assertEquals("aaaooo", fine, "Expected string: 'aaaooo' actual " + fine);
    }

    @DisplayName("str: 'oohoi'; answer = 'hiooo'")
    @Test
    void test12() {
        String fine = calculateEndooMethod.invokeStaticMethod("oohoi");
        assertEquals("hiooo", fine, "Expected string: 'hiooo' actual " + fine);
    }

    @DisplayName("str: 'oanotgo'; answer = 'antgooo'")
    @Test
    void test13() {
        String fine = calculateEndooMethod.invokeStaticMethod("oanotgo");
        assertEquals("antgooo", fine, "Expected string: 'antgooo' actual " + fine);
    }
}
