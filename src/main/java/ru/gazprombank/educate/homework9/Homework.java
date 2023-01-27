package ru.gazprombank.educate.homework9;

public class Homework {

    public static boolean isOrdered(int first, int second, int third, boolean itsOk) {

        return (itsOk && third > second  ? true : (third > second && second > first ? true : false));
    }

    ;

    public static void main(String[] args) {

    }
}
