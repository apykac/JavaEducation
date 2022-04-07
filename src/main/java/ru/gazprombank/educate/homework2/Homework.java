package ru.gazprombank.educate.homework2;
import java.text.DecimalFormat;

public class Homework {
    public static void main(String[] args) throws TriangleExistException {

    }
    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {
        if (a<=0 || b<=0 || c<=0 ||a + b < c || a + c < b || b + c < a) {
            throw new TriangleExistException("sides: "+ a + " " + b + " " + c + "; exception - triangle not exist");
        }

        double hp = (a + b + c) / 2.0;
        double value = Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
        return Math.round(value * 1000d) / 1000d;
    }
}
