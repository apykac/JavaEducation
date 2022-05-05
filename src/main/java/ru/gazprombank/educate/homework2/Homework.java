package ru.gazprombank.educate.homework2;

public class Homework {
    public static void main(String[] args)  {

    }
    public static double calculateTriangleArea (int a, int b, int c)  throws TriangleExistException {
        // Одиночные операторы сравнения (|, &) лучше не использовать, используй всегда двойные
        // Тело условия и цикла, даже если содержит всего одну строку, всегда оборачивай в скобки { }
        if ((a + b < c) | (b + c < a) | (a + c < b)) throw new TriangleExistException ();

        // Между переменными и знаками лучше ставить пробел, так более читаем код
        double p = (a+b+c)/2.0;
        double s = Math.sqrt(p * (p-a) * (p-b) * (p-c));

        s = s * 1000;
        s = Math.round(s);
        s = s / 1000;

        return s;

        // Форматирование текста (отступы, переходы) не забывай поправлять
        }

}
