package ru.gazprombank.educate.homework9;

public class Homework {

    public static void main(String[] args) {

    }

    public static boolean isOrdered(int first, int second, int third, boolean itsOk){
        if (itsOk){
            return second < third;
        } else {
            return second > first && third > second;
        }
    }
}
