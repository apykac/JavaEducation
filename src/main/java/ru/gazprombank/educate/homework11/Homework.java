package ru.gazprombank.educate.homework11;

public class Homework {

    public static void main(String[] args) {
    }
    public static String fizzyWizzy(int n) {
        String pwd = String.valueOf(n);
        if ((n % 5 == 0) && (n % 3 == 0)) {
            return "FizzBuzz!";
        }
        if (n % 3 == 0) {
            return "Fizz!";
        }
        if (n % 5 == 0) {
            return "Buzz!";
        }
        return pwd + "!";
    }
}
