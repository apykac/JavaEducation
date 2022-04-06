package ru.gazprombank.educate.homework4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.gazprombank.educate.test.util.AssertUtils;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.Pair;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

class HomeworkTest {
    private TestMethod randomMatrixMethod;

    @BeforeEach
    void setUp() {
        TestClass testClass = AssertUtils.getClass("ru.gazprombank.educate.homework4.Homework");
        randomMatrixMethod = AssertUtils.getMethod(testClass,
                "randomMatrix",
                int[][].class.getName(),
                Modifier.modifiersToList(Modifier.PUBLIC, Modifier.STATIC),
                List.of(int[][].class.getName()));
    }

    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {
            "1 attempt",
            "2 attempt",
            "3 attempt",
            "4 attempt",
            "5 attempt",
            "6 attempt",
    })
    void matrixTest(String s) {
        Pair<int[][], int[][]> pairs = getArrays();
        int[][] array1 = pairs.getFirst();
        int[][] array2 = pairs.getSecond();

        int[][] resultArray1 = randomMatrixMethod.invokeStaticMethod((Object) array1);
        int[][] resultArray2 = randomMatrixMethod.invokeStaticMethod((Object) array2);

        assertSame(array1, resultArray1, "Array must be same as in parameters");
        assertSame(array2, resultArray2, "Array must be same as in parameters");
        boolean isEquals = true;
        for (int i = 0; i < resultArray1.length; i++) {
            for (int j = 0; j < resultArray1[i].length; j++) {
                if (resultArray1[i][j] == 0 || resultArray2[i][j] == 0) {
                    fail("Arrays must be fill by not '0' numbers");
                }
            }
            isEquals = isEquals && Arrays.equals(resultArray1[i], resultArray2[i]);
        }

        assertFalse(isEquals, "Array fill must be random");
    }

    private Pair<int[][], int[][]> getArrays() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int baseLength = random.nextInt(11);

        int[][] array1 = new int[baseLength][];
        int[][] array2 = new int[baseLength][];

        for (int i = 0; i < baseLength; i++) {
            int innerLength = random.nextInt(11);
            array1[i] = new int[innerLength];
            array2[i] = new int[innerLength];
        }

        return new Pair<>(array1, array2);
    }
}
