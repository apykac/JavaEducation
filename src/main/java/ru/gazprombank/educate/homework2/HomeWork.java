package ru.gazprombank.educate.homework2;

/**
 * В классе создан статический публичный метод для приёма длин строн треугольника и вычисления его площади по сторонам
 * по формуле Герона. Метод возвращает площадь с округлением до трёх знаков
 */
public class HomeWork {

    public static double semiPer(int a, int b, int c) {
        return (a + b + c) / 2;
    }

    public static double calculateTriangleArea(int a, int b, int c) {
        return Math.sqrt(semiPer(a, b, c) * (semiPer(a, b, c) - a) * (semiPer(a, b, c) - b) * (semiPer(a, b, c) - c));
    }

    public static void main(String[] args) throws TriangleExistException {
        double resultCalculation;

        TriangleArea triangleArea = new TriangleArea(8, 4, 7);

        if ((triangleArea.a + triangleArea.b <= triangleArea.c) ||
                (triangleArea.a + triangleArea.c <= triangleArea.b) ||
                (triangleArea.b + triangleArea.c <= triangleArea.a)) {

            throw new TriangleExistException("triangle not exist");
        }

        resultCalculation = calculateTriangleArea(triangleArea.a, triangleArea.b, triangleArea.c);
        System.out.printf("Площадь треугольника со сторонами " + triangleArea.a + ", " +
                triangleArea.b + ", " + triangleArea.c + " равна " + "%.3f", resultCalculation);
    }
}
