package ru.gazprombank.educate.homework11;

public class Homework {

    public static void main(String[] args) {

    }

    public static String fizzyWizzy (int n) {
        String s = "";
        int mod3 = n % 3;
        int mod5 = n % 5;
        if (mod3 == 0)
            s = "Fizz!";
        if (mod5 == 0)
            s = "Buzz!";
        // Одинарные операторы сравнения
        if ((mod3 == 0) & (mod5 == 0))
            s = "FizzBuzz!";
        if ((mod3 != 0) & (mod5 != 0))
            s = n + "!";
        return s;
    }
}
