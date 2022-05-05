package ru.gazprombank.educate.homework9;

public class Homework {

    public static boolean isOrdered(int first, int second, int third, boolean itsOk) {
        if (itsOk) {
            if (third > second)
                return true;
        }
        if (second > first && third > second)
            return true;
        return false;
    }

    public static void main(String[] args) {

    }
}
