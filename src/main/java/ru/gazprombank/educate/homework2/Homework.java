package ru.gazprombank.educate.homework2;

public class Homework {
    public static void main(String[] args) throws TriangleExistException {
        int a = 7;
        int b = 7;
        int c = 2;
        System.out.println(calculateTriangleArea(a, b, c));
    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {

        if (a < 0 || b < 0 || c < 0 || (a + b <= c) || a + c <= b || b + c <= a) throw new TriangleExistException();


        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;

    }
}






