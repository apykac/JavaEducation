package ru.gazprombank.educate.homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework {
    public static void main(String[] args) {
        int a = 7;
        int b = 18;
        int c = 24;
        try{
            System.out.println(calculateTriangleArea(a,b,c));
        } catch (TriangleExistException e) {
             e.printStackTrace();
        }
    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException{
        double p = (double) (a + b + c)/2;
        if ( (a + b > c) && (b + c > a) && (c + a > b) ) {
            return BigDecimal.valueOf(Math.sqrt(p*(p-a)*(p-b)*(p-c))).setScale(3, RoundingMode.HALF_DOWN).doubleValue();
        } else {
            throw new TriangleExistException();
        }
    }
}
