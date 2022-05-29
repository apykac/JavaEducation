package ru.gazprombank.educate.homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework {
    public static void main(String[] args) throws TriangleExistException {

        System.out.println(calculateTriangleArea(5.7456,6,3.186));

    }

    public static double calculateTriangleArea(double a, double b, double c) throws TriangleExistException {

        double square = 0;

        try {
            square = a*b*c;
            if (square == 0) throw new TriangleExistException();
        }
        catch (TriangleExistException t) {
            System.out.println("Not a Triangle");
        }

        BigDecimal result = new BigDecimal(square);
        result = result.setScale(3, RoundingMode.HALF_UP);

        return result.doubleValue();
    }
}
