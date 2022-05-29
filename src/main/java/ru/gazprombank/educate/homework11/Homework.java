package ru.gazprombank.educate.homework11;

public class Homework {

    public static void main(String[] args) {
        System.out.println(fizzyWizzy(3));
    }

    public static String fizzyWizzy(int n){
        String answer;
        if(n % 5 == 0 && n % 3 == 0) answer = "FizzBuzz!";
        else if(n % 5 == 0) answer = "Buzz!";
        else if(n % 3 == 0) answer = "Fizz!";
        else answer = String.format("%s!", n);
        return answer;
    }
}
