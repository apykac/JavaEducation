package ru.gazprombank.educate.homework12;

public class Homework {

    public static void main(String[] args) {

    }

    public static int sumUnique (int a, int b, int c) {
        int sum = a + b + c;
        // Одинарный оператор сравнения
        if ((a == b) & (a == c))
            sum = 0;
        else {
            if (a == b)
                sum = c;
            if (a == c)
                sum = b;
            if (b == c)
                sum = a;
        }
        return sum;
    }
}
