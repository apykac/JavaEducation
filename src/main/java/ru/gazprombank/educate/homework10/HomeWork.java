package ru.gazprombank.educate.homework10;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(isCool(22));

    }
    public static boolean isCool (int n){
        boolean result = false;
        if (n % 11 == 0 || n % 11 == 1) {
            result = true;
        }
        return result;
    }
}
