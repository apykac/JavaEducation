package ru.gazprombank.educate.homework11;

public class HomeWork {

    public static void main(String[] args) {

    }
    public static String fizzyWizzy(int n){
        if (n%3 == 0 && n%5 != 0){
            return "Fizz!";
        }
        else if (n%5 == 0 && n%3 !=0){
            return "Buzz!";
        }
        else if (n%5 == 0 && n%3 == 0){
            return "FizzBuzz!";
        }
        else {
            return n + "!";
        }
    }
}
