package ru.gazprombank.educate.homework2;
public class Homework {
    public static void main(String[] args) throws TriangleExistException {
        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println("Площадь треугольника:" + calculateTriangleArea(a, b, c));
    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {
        double s;
        if (a + b > c && a + c > b && b + c > a) {
            double p;
            p = (a + b + c) / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            s = (double) Math.round(s * 1000) / 1000;
        } else {
            throw new TriangleExistException();
        }
        return s;
    }
    }
