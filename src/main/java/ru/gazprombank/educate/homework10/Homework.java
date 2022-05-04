package ru.gazprombank.educate.homework10;

public class Homework {

    public static void main(String[] args) {
        isCool(21);
        System.out.println(true);
    }

    public static boolean isCool(int n) {

        if (n % 11 == 0 || n % 11 == 1) {
            return true;
                              }
        else {
            return false;
        }
    }
}
