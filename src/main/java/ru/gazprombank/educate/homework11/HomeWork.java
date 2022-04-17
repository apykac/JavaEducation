package ru.gazprombank.educate.homework11;

public class HomeWork {

    public static void main(String[] args) {

    }

    public static String fizzyWizzy(int n) {
        String result = "";
        if ((n % 3 == 0) && (n % 5 == 0)) {
            result = "FizzBuzz!";
        } else if (n % 3 == 0) {
            result = "Fizz!";
        } else if (n % 5 == 0) {
            result = "Buzz!";
        } else result = n +"!";
        return result;
    }

}
