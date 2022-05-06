package ru.gazprombank.educate.homework10;

public class Homework {

    public static void main(String[] args) {

    }

    public static boolean isCool (int n) {
        boolean cool = false;
        int mod = n % 11;
        if ((mod == 0) || (mod == 1)) {
            cool = true;
        }
        return cool;
    }
}
