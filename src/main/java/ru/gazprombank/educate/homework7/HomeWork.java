package ru.gazprombank.educate.homework7;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(twoSumOne(3, 2, 2));
    }
    public static boolean twoSumOne(int a, int b, int c){
        boolean result = false ;
        if (a + b == c || b + c == a || a + c == b) {
            result = true;
        }
        return result;
    }
}
