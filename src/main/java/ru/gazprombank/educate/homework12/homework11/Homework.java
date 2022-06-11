package ru.gazprombank.educate.homework12.homework11;

public class Homework {

    public static void main(String[] args) {

    }

    public static String fizzyWizzy(int n){
        if (n % 3 ==0 && n % 5 ==0){
            return "FizzBuzz!";
        } else if (n % 3 == 0){
            return "Fizz!";
        } else if (n % 5 == 0){
            return "Buzz!";
        } else {
            return n + "!";
        }
    }
}
