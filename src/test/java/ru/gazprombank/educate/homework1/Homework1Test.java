package ru.gazprombank.educate.homework1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.Pair;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class Homework1Test {
    private static final char[] ALLOWED_CHARACTERS;

    static {
        ALLOWED_CHARACTERS = new char[('z' - 'a' + 1) + ('Z' - 'A' + 1) + 10];
        int index = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            ALLOWED_CHARACTERS[index++] = c;
        }
        for (int i = 0; i < 10; i++) {
            ALLOWED_CHARACTERS[index++] = ' ';
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            ALLOWED_CHARACTERS[index++] = c;
        }
    }

    private TestMethod punctuationCountMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework1.HomeWork");
        punctuationCountMethod = AssertUtils.getMethod(testClass,
                "punctuationCount",
                int.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String.class.getName()));
    }

    @ParameterizedTest(name = "case {0}")
    @CsvSource(quoteCharacter = 'd', delimiter = 's', value = {
            "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-",
            ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "\\", "]", "^",
            "_", "`", "{", "|", "}", "~"
    })
    void test(char c) {
        Pair<String, Integer> testPair = getString(c);
        String testString = testPair.getFirst();
        Assertions.assertEquals(testPair.getSecond(), punctuationCountMethod.<Integer>invokeStaticMethod(testString), "Count of '" + c + "' must be " + testPair.getSecond() + " in: [" + testString + "] ");
    }

    private Pair<String, Integer> getString(char c) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int length = random.nextInt(15, 51);
        int punctuationChance = random.nextInt(101);
        int punctuationLength = random.nextInt(1, 11);
        int punctuationCont = 0;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            boolean isPunctuationCharacter = punctuationCont < punctuationLength && random.nextInt(101) < punctuationChance;
            if (isPunctuationCharacter) {
                result[i] = c;
                punctuationCont++;
            } else {
                result[i] = ALLOWED_CHARACTERS[random.nextInt(ALLOWED_CHARACTERS.length)];
            }
        }
        return new Pair<>(new String(result), punctuationCont);
    }
}
