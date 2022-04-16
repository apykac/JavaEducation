package ru.gazprombank.educate.homework9;

public class Homework {
    public static boolean isOrdered(int first, int second, int third, boolean itsOk) {
        if (itsOk == true) {
            if ((second <= first || second > first) && (second < third)) {
                return true;
            } else {
                return false;
            }
        } else {
            if ((second > first) && (third > second)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
