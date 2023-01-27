package ru.gazprombank.educate.homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Homework extends TriangleExistException {

    public Homework() {

    }

    public static double calculateTriangleArea(int m, int n, int u) throws TriangleExistException {

        double square;
        double square1;
        if ((m + n > u) && (n + u > m) && (m + u > n)) {
            double p = (double) (m + n + u) / 2;

            square = sqrt(p * (p - m) * (p - n) * (p - u));

            BigDecimal bd = new BigDecimal(square);

            bd = bd.setScale(3, RoundingMode.HALF_UP);

            square1 = bd.doubleValue();
        } else {
            throw new TriangleExistException();
        }


        return square1;
    }

    public static void main(String[] args) throws TriangleExistException {

        int m = 5;
        int n = 6;
        int u = 7;

        try {
            calculateTriangleArea(m, n, u);
        } catch (TriangleExistException e) {
            System.out.println(e.getMessage());
        }

    }
}
