package ru.gazprombank.educate.homework9;

public class Homework {

    public static void main(String[] args) {

        int first = 5;
        int second = 2;
        int third = 3;
        boolean itsOk = true;
        System.out.println(isOrdered(1, 2, 3, true));
    }

    public static boolean isOrdered(int first, int second, int third, boolean itsOk) {
        boolean isOrdered = true;
        if (itsOk) {
            if (second < third)
                isOrdered = true;
        } else {
            if ((first < second) & (second < third))
                isOrdered = true;
        }
        return isOrdered;
    }
}



