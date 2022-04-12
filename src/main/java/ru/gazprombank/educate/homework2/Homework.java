package ru.gazprombank.educate.homework2;

import java.awt.geom.Area;

public class Homework {
    public static void main(String[] args) throws TriangleExistException {
        System.out.println(Homework.calculateTriangleArea(10, 8, 18));
    }
        public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {
        if (a+b<=c) {
            throw new TriangleExistException();
        }
        int p = (a+b+c)/2;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));

            }
}
