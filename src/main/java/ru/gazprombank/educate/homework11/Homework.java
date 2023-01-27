package ru.gazprombank.educate.homework11;

public class Homework {

    public static String fizzyWizzy (int n){


        String op = String.valueOf(n).concat("!");

        return (n%15==0? ("FizzBuzz!"):(n%5==0?("Buzz!"):(n%3==0?("Fizz!"):op)));

    }
    public static void main(String[] args) {

    }
}
