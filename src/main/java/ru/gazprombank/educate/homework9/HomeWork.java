package ru.gazprombank.educate.homework9;

public class HomeWork {

    public static void main(String[] args) {

    }
    public static boolean isOrdered(int first, int second, int third, boolean itsOk){
        if (itsOk){
            return first>=second && second<third;
        }
        else {
            return first<second && second<third;
        }
    }
}
