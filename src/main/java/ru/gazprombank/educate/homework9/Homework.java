package ru.gazprombank.educate.homework9;

public class Homework {

    public static void main(String[] args) {

    }
    public static boolean isOrdered(int first, int second, int third, boolean itsOk){
        return second > first && third > second || itsOk && third > second;
    }
}
