package ru.gazprombank.educate.homework2;

import java.text.DecimalFormat;

public class Homework {

    public static double calculateTriangleArea(int a, int b, int c) {
        try {
            if (a + b > c && a + c > b && b + c > a) {
                double scale = Math.pow(10, 3);
                double pPerimetr = (double) (a + b + c) / 2;
                double result = Math.sqrt(pPerimetr * (pPerimetr - a) * (pPerimetr - b) * (pPerimetr - c));
                return Math.ceil(result * scale) / scale;
            } else
                throw new TriangleExistException();
        } catch (TriangleExistException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) throws Throwable {
        System.out.println(Homework.calculateTriangleArea(8, -1, 7));

    }
}
