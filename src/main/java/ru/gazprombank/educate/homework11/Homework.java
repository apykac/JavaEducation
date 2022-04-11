package ru.gazprombank.educate.homework11;

public class Homework {

    public static void main(String[] args) {
        System.out.println(fizzyWizzy(1));

    }
    public static String fizzyWizzy(int n) {
        String result ="";
        if (n % 3 == 0 && n % 5 == 0 ) {
            result = "FizzBuzz!";
        } else if (n % 5 == 0) {
            result = "Buzz!";
        } else if (n % 3 == 0) {
            result = "Fizz!";
        } else {
            result = n + "!";
        }
        return result;
    }
}
