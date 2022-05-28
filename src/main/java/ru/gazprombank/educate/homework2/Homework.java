package ru.gazprombank.educate.homework2;

public class Homework {
    public static void main(String[] args) {
        try {
            System.out.printf("%.3f", calculateTriangleArea(1, 4, 7));
        } catch (TriangleExistException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {

        if ((a + b < c) | (a + c < b) | (b + c < a)) throw new TriangleExistException("It's not a triangle!");

        double perimeter = ((double) a + (double) b + (double) c) / 2;
        double triangleArea = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        triangleArea = triangleArea * 1000;
        int result = (int) Math.round(triangleArea);
        triangleArea = (double) result / 1000;
        return triangleArea;

    }
}
