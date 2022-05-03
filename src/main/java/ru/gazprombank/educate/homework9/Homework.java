package ru.gazprombank.educate.homework9;

public class Homework {

    public static void main(String[] args) {
        System.out.println(isOrdered(1, 2, 3, true));
    }

    public static boolean isOrdered(int first, int second, int third, boolean itsOk) {
        boolean order = false;
        if (itsOk) {
            if (second < third)
                order = true;
        } else {
            if ((first < second) & (second < third))
                order = true;
        }
        return order;
    }
}
