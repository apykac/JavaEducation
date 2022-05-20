package ru.gazprombank.educate.homework7;

public class Homework {

    public static void main(String[] args) {

    }

    public static boolean twoSumOne(int a, int b, int c){
       if  (a + b == c || a + c == b || b + c == a) return true;
       return false;
    }
}