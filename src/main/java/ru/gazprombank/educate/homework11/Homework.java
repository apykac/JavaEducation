package ru.gazprombank.educate.homework11;

public class Homework {
    public static String fizzyWizzy(int n) {
        String str = String.valueOf(n);

        if ((n % 3 == 0) && (n % 5 == 0)) {
            return "FizzBuzz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        }
        return str + "!";
    }

    public static void main(String[] args) {

    }
}