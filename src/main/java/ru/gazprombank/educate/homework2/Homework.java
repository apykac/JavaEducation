package ru.gazprombank.educate.homework2;
public class Homework {
    public static void main(String[] args) throws TriangleExistException {
        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println("Площадь треугольника:" + calculateTriangleArea(a, b, c));
    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {
        int p;
        if (a + b > c && a + c > b && b + c > a) {
            p = (a + b + c) / 2;
        } else {
            throw new TriangleExistException();
        }
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    }
