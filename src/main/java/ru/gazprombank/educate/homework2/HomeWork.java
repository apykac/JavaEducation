package ru.gazprombank.educate.homework2;

/**
 * В классе создан статический публичный метод для приёма длин строн треугольника и вычисления его площади по сторонам
 * по формуле Герона. Метод возвращает площадь с округлением до трёх знаков
 */
public class HomeWork {

    public double a;
    public double b;
    public double c;

    public HomeWork(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double semiPer(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        return Math.sqrt(semiPer(a, b, c) * (semiPer(a, b, c) - a) * (semiPer(a, b, c) - b) * (semiPer(a, b, c) - c));
    }

    public static void main(String[] calculateTriangleArea) throws TriangleExistException {
        double resultCalculation;

        HomeWork triangleArea = new HomeWork(8, 4, 7);

        try {
            if ((triangleArea.a + triangleArea.b <= triangleArea.c) ||
                    (triangleArea.a + triangleArea.c <= triangleArea.b) ||
                    (triangleArea.b + triangleArea.c <= triangleArea.a)) {

                throw new TriangleExistException("Треугольников с такими сторонами не бывает. " +
                        "Одна сторона больше суммы двух других сторон.");
            }

            resultCalculation = HomeWork.calculateTriangleArea(triangleArea.a,
                    triangleArea.b, triangleArea.c);
            System.out.printf("Площадь треугольника со сторонами " + triangleArea.a + ", " +
                    triangleArea.b + ", " + triangleArea.c + " равна " + "%.3f", resultCalculation);
        } catch (TriangleExistException e) {
            System.out.println(e.getMessage());
        }

    }
}
