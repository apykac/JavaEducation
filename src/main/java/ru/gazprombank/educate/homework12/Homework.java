package ru.gazprombank.educate.homework12;

public class Homework {

    public static void main(String[] args) {
        sumUnique(4, 4, 3);
    }

    public static void sumUnique(int a, int b, int c) {
        int sum = a + b + c;
        if (a != b && b != c && a != c) {
            System.out.println(sum);
        }
        if (a == b) {
            System.out.println(c);
        }
        if (a == c) {
            System.out.println(b);
        }
        if (b == c) {
            System.out.println(a);
        }
    }
}
