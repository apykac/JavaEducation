package ru.gazprombank.educate.homework9;

public class HomeWork {

    public static void main(String[] args) {

    }

    public static boolean isOrdered(int first, int second, int third, boolean itsOk) {
        boolean order = false;
        if (itsOk == false) {
            if ((first < second) & (second < third)) {
                order = true;
            }
        }
        else {
            if (second < third) {
                order = true;
            }
        }
        return order;
    }
}
