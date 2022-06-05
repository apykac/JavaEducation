package ru.gazprombank.educate.homework25;

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

    private TestMethod calculateGetPrefixMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework25.Homework");
        calculateGetPrefixMethod = AssertUtils.getMethod(testClass,
                "getPrefix",
                String.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String[].class.getName()));
    }

    @DisplayName("str: {\"test2\", \"test2\", \"test2Tr\", \"te\"}; answer = 'te'")
    @Test
    void test1() throws Exception {
        String fine = calculateGetPrefixMethod.invokeStaticMethod((Object) new String[]{"test2", "test2", "test2Tr", "te"});
        assertEquals("te", fine, "Expected string: 'te' actual " + fine);
    }

    @DisplayName("str: {\"atest2\", \"btest2\", \"ctest2Tr\", \"te\"}; answer = ''")
    @Test
    void test2() throws Exception {
        String fine = calculateGetPrefixMethod.invokeStaticMethod((Object) new String[]{"atest2", "btest2", "ctest2Tr", "te"});
        assertEquals("", fine, "Expected string: '' actual " + fine);
    }

    @DisplayName("str: {\"\", \"\", \"te\"}; answer = ''")
    @Test
    void test3() throws Exception {
        String fine = calculateGetPrefixMethod.invokeStaticMethod((Object) new String[]{"", "", "te"});
        assertEquals("", fine, "Expected string: '' actual " + fine);
    }

    @DisplayName("str: {\"test1\", \"test12\", \"test123\", \"test1234\"}; answer = 'test1'")
    @Test
    void test4() throws Exception {
        String fine = calculateGetPrefixMethod.invokeStaticMethod((Object) new String[]{"test1", "test12", "test123", "test1234"});
        assertEquals("test1", fine, "Expected string: 'test1' actual " + fine);
    }

    @DisplayName("str: {\"00000000\", \"000\", \"111111111111111\", \"11111111111111111111111122222222\"}; answer = ''")
    @Test
    void test5() throws Exception {
        String fine = calculateGetPrefixMethod.invokeStaticMethod((Object) new String[]{"00000000", "000", "111111111111111", "11111111111111111111111122222222"});
        assertEquals("", fine, "Expected : 'test1' actual " + fine);
    }
}
