package ru.gazprombank.educate.homework9;

public class Homework {

    public static void main(String[] args) {
        boolean itsOk = false;
        System.out.println(isOrdered(3, 2, 3, itsOk));
    }

    public static boolean isOrdered(int first, int second, int third, boolean itsOk) {

        if (!itsOk && second > first && third > second) {
            return true;
        }
        if (itsOk && second < third) {
            return true;
        } else {
            return false;
        }
    }
}
