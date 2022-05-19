package ru.gazprombank.educate.homework2;

public class Homework {
    public static void main(String[] args) throws TriangleExistException {
        try{
            double s = Homework.calculateTriangleArea(8, 100, 7);
            System.out.println(s);
        } catch(TriangleExistException e) {
            System.out.println("Triangle not exist");
        }
    }
    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {

        try {
            double s = 0 ;
            if (a > b + c || b > a + c || c > a + b) {
                throw new TriangleExistException();
            }
            else {
                double perimetr = (a + b + c) / 2d;
                s = Math.sqrt(perimetr * (perimetr - a) * (perimetr - b) * (perimetr - c));
                double scale = Math.pow(10, 3);
                double result = Math.ceil(s * scale) / scale;
                return result;

            }
        } catch (TriangleExistException e) {
            System.out.println(e);
            throw e;
        }
    }

}