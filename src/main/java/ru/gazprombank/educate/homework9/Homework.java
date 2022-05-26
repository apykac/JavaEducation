package ru.gazprombank.educate.homework9;

public class Homework {

    public static void main(String[] args) {
        System.out.println(isOrdered(2,4,5,true));

    }

    public static boolean isOrdered(int first, int second, int third, boolean itsOk) {
        if (second > first && third > second) {
            return true;
        }
        if (!itsOk && second < third) {
            return true;
        } else {
            return false;
        }
    }
}
