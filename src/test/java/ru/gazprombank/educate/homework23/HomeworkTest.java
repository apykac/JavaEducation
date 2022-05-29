package ru.gazprombank.educate.homework23;

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

    private TestMethod calculateInsideBracketsMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework23.Homework");
        calculateInsideBracketsMethod = AssertUtils.getMethod(testClass,
                "insideBrackets",
                String.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @DisplayName("str: 'xyz[abc]123'; answer = '[abc]'")
    @Test
    void test1() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("xyz[abc]123");
        assertEquals("[abc]", fine, "Expected string: '[abc]' actual " + fine);
    }

    @DisplayName("str: 'x[hello]'; answer = '[hello]'")
    @Test
    void test2() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("x[hello]");
        assertEquals("[hello]", fine, "Expected string: '[hello]' actual " + fine);
    }

    @DisplayName("str: '[xy]1'; answer = '[xy]'")
    @Test
    void test3() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("[xy]1");
        assertEquals("[xy]", fine, "Expected string: '[xy]' actual " + fine);
    }

    @DisplayName("str: 'not really [possible]'; answer = '[possible]'")
    @Test
    void test4() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("not really [possible]");
        assertEquals("[possible]", fine, "Expected string: '[possible]' actual " + fine);
    }

    @DisplayName("str: '[abc]'; answer = '[abc]'")
    @Test
    void test5() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("[abc]");
        assertEquals("[abc]", fine, "Expected string: '[abc]' actual " + fine);
    }

    @DisplayName("str: '[abc]xyz'; answer = '[abc]'")
    @Test
    void test6() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("[abc]xyz");
        assertEquals("[abc]", fine, "Expected string: '[abc]' actual " + fine);
    }

    @DisplayName("str: '[abc]x'; answer = '[abc]'")
    @Test
    void test7() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("[abc]x");
        assertEquals("[abc]", fine, "Expected string: '[abc]' actual " + fine);
    }

    @DisplayName("str: '[x]'; answer = '[x]'")
    @Test
    void test8() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("[x]");
        assertEquals("[x]", fine, "Expected string: '[x]' actual " + fine);
    }

    @DisplayName("str: '[]'; answer = '[]'")
    @Test
    void test9() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("[]");
        assertEquals("[]", fine, "Expected string: '[]' actual " + fine);
    }

    @DisplayName("str: 'res [ipsa] loquitor'; answer = '[ipsa]'")
    @Test
    void test10() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("res [ipsa] loquitor");
        assertEquals("[ipsa]", fine, "Expected string: '[ipsa]' actual " + fine);
    }

    @DisplayName("str: 'hello[not really]there'; answer = '[not really]'")
    @Test
    void test11() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("hello[not really]there");
        assertEquals("[not really]", fine, "Expected string: '[not really]' actual " + fine);
    }

    @DisplayName("str: 'ab[ab]ab'; answer = '[ab]'")
    @Test
    void test12() throws Exception {
        String fine = calculateInsideBracketsMethod.invokeStaticMethod("ab[ab]ab");
        assertEquals("[ab]", fine, "Expected string: '[ab]' actual " + fine);
    }
}
