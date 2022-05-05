package ru.gazprombank.educate.homework11;

public class Homework {

    public static String fizzyWizzy(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            return "FizzBuzz!";
        if (n % 3 == 0)
            return "Fizz!";
        if (n % 5 == 0)
            return "Buzz!";

        return n + "!";
    }

    public static void main(String[] args) {

    }
}
