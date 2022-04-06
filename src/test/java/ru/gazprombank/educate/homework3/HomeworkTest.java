package ru.gazprombank.educate.homework3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.print.PrintWrapper;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.List;

class HomeworkTest {
    private static final PrintWrapper PRINT_WRAPPER = new PrintWrapper();

    private TestMethod printMatrix;

    @AfterAll
    static void tearDownClass() {
        PRINT_WRAPPER.off();
    }

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework3.HomeWork");
        printMatrix = AssertUtils.getMethod(testClass,
                "printMatrix",
                void.class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(String[][].class.getName()));
        PRINT_WRAPPER.off();
        PRINT_WRAPPER.clear();
        PRINT_WRAPPER.on();
    }

    @DisplayName("1 2 3\n4 5 6\n7 8 9")
    @Test
    void test1() {
        printMatrix.invokeStaticMethod(new Object[]{new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}});
        PRINT_WRAPPER.off();
        System.out.println(PRINT_WRAPPER.getOutString());
        Assertions.assertEquals(PRINT_WRAPPER.getOutString(), "1 2 3\n4 5 6\n7 8 9");
    }

    @DisplayName("1 2 3 4\n4 5 6 45\n7 8 9 12")
    @Test
    void test2() {
        printMatrix.invokeStaticMethod(new Object[]{new int[][]{{1, 2, 3, 4}, {4, 5, 6, 45}, {7, 8, 9, 12}}});
        PRINT_WRAPPER.off();
        System.out.println(PRINT_WRAPPER.getOutString());
        Assertions.assertEquals(PRINT_WRAPPER.getOutString(), "1 2 3 4\n4 5 6 45\n7 8 9 12");
    }

    @DisplayName("1 2\n4 5\n7 8\n4 67\n33 111")
    @Test
    void test3() {
        printMatrix.invokeStaticMethod(new Object[]{new int[][]{{1, 2}, {4, 5}, {4, 67}, {33, 111}}});
        PRINT_WRAPPER.off();
        System.out.println(PRINT_WRAPPER.getOutString());
        Assertions.assertEquals(PRINT_WRAPPER.getOutString(), "1 2\n4 5\n7 8\n4 67\n33 111");
    }
}
