package ru.gazprombank.educate.homework11;

public class Homework {

    public static void main(String[] args) {

        //fizzyWizzy(3);
    }
    public static String fizzyWizzy(int n){
        String flizz = "Fizz";
        String buzz = "Buzz";
        String stringAnswer = n + "!";

        //if((n % 3) == 0) ? (stringAnswer = flizz) : stringAnswer);

        if(n % 3 == 0){
            stringAnswer = flizz + "!";
        }
        if(n % 5 == 0){
            stringAnswer = buzz + "!";
        }
        if(n % 3 == 0 && n % 5 == 0){
            stringAnswer = flizz + buzz + "!";
        }

        return stringAnswer;
    }
}
