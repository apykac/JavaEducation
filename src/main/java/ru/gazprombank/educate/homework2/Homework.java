package ru.gazprombank.educate.homework2;

public class Homework {
    public static void main(String[] args) throws TriangleExistException {
        System.out.println(Homework.calculateTriangleArea(5, 7, 8));
    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {

        if (a <= 0 || b <= 0 || c <= 0 || (a + b < c) || (a + c < b) || (b + c < a)) throw new TriangleExistException();

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        s = s * 1000;
        int result = (int) Math.round(s);
        s = (double) result / 1000;
        return s;

    }
}
