package ru.gazprombank.educate.homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework {
    public static void main(String[] args) throws TriangleExistException {

        System.out.println(calculateTriangleArea(2,3,40));

    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {

        double square = 0;
        double p = (a+b+c)/2.0;


        if (!((a+b>c)&(b+c>a)&(a+c>b))){
            throw new TriangleExistException("triangle not exist");
        }
        square = Math.sqrt(p*(p-a)*(p-b)*(p-c));


        BigDecimal result = new BigDecimal(square);
        result = result.setScale(3, RoundingMode.HALF_UP);

        return result.doubleValue();
    }
}
