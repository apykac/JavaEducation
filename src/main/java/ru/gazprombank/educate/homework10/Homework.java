package ru.gazprombank.educate.homework10;

public class Homework {

    public static void main(String[] args) {

    }
    public static boolean isCool(int n){
        boolean ok = false;

        if(n % 11 == 0 || n % 11 == 1){
            ok = true;
        }
        return ok;
    }
}
