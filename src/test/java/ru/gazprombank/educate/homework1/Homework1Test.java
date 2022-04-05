package ru.gazprombank.educate.homework1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.List;

public class Homework1Test {
    private TestMethod homeWorkClass;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework1.HomeWork");
        homeWorkClass = AssertUtils.getMethod(testClass,
                "punctuationCount",
                int.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @ParameterizedTest(name = "case {0}")
    @CsvSource({
            "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-",
            ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "\\", "]", "^",
            "_", "`", "{", "|", "}", "~"
    })
    void test(char c) {
        String testString = c + "some list" + c + " or no" + c + "t list " + c + " i " + c + "dont know " + c;
        Assertions.assertEquals(6, homeWorkClass.<Integer>invokeStaticMethod(testString), "Count of '" + c + "' must be 6 in: [" + testString + "] ");
    }
}
