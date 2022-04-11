package ru.gazprombank.educate.homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * В классе создан статический публичный метод для приёма длин строн треугольника и вычисления его площади по сторонам
 * по формуле Герона. Метод возвращает площадь с округлением до трёх знаков
 */
public class Homework {

    public static double semiPer(int a, int b, int c) {
        return (a + b + c) / 2.0;
    }

    public static double calcTriangle(int a, int b, int c) {
        double result;
        result = Math.sqrt(semiPer(a, b, c) * (semiPer(a, b, c) - a) * (semiPer(a, b, c) - b) * (semiPer(a, b, c) - c));
        BigDecimal result1 = new BigDecimal(result);
        result1 = result1.setScale(3, RoundingMode.HALF_UP);

        return result1.doubleValue();
    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new TriangleExistException("triangle not exist");
        }

        return calcTriangle(a, b, c);
    }

    public static void main(String[] args) {

    }
}
