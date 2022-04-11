package ru.gazprombank.educate.homework2;

public class Homework {
    public static void main(String[] args)  {

    }
    public static double calculateTriangleArea (int a, int b, int c)  throws TriangleExistException {
        if ((a + b < c) | (b + c < a) | (a + c < b)) throw new TriangleExistException ();

        double p = (a+b+c)/2.0;
        double s = Math.sqrt(p * (p-a) * (p-b) * (p-c));

        s = s * 1000;
        s = Math.round(s);
        s = s / 1000;

        return s;
        }

}
