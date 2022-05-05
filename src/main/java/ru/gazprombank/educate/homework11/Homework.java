package ru.gazprombank.educate.homework11;

public class Homework {

    public static void main(String[] args) {
        fizzyWizzy(2);
    }

    public static void fizzyWizzy(int n) {
        if (n % 3 == 0 && n % 5 !=0 ) {
            System.out.println("Fizz!");
        }
        if (n % 5 == 0 && n % 3 !=0 ) {
            System.out.println("Buzz!");
        }
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz!");
        } else  {
            System.out.println(n + "!");
        }
            }
}
