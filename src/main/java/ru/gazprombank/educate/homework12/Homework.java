package ru.gazprombank.educate.homework12;

public class Homework {

    public static void main(String[] args) {
        System.out.println(sumUnique(3, 3, 2));
    }

    public static int sumUnique(int a, int b, int c) {
        int sumInt = 0;
        int[] myArray = {a, b, c};
        int count = 0;

        for (int k : myArray) {
            for (int i : myArray) {
                if (k == i) count++;
            }
            if (count == 1) sumInt += k;
            count = 0;
        }
        return sumInt;
    }
}
