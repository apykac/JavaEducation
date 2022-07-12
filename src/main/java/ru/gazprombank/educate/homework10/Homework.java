package ru.gazprombank.educate.homework10;

public class Homework {


    public static void main(String[] args) {
        int n = 11;
        System.out.println(isCool(11));
    }

    public static boolean isCool(int n) {

        if (n % 11 == 0) {
            return true;
        } else if (n % 11 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
