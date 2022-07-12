package ru.gazprombank.educate.homework11;

public class Homework {

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fizzyWizzy(25));
    }

    public static String fizzyWizzy(int n) {

        String fizzyWizzy="";
        if (n % 3 == 0)
        fizzyWizzy = "Fizz!";
        if (n % 5 == 0)
        fizzyWizzy = "Buzz!";

        if ((n % 3 == 0) && (n % 5 == 0))
        fizzyWizzy = "FizzBuzz!";

        return fizzyWizzy;

    }

}









