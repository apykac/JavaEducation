package ru.gazprombank.educate.homework12;

public class Homework {
        public static int sumUnique(int a, int b, int c) {
            int sum;
            if ((a == b) && (a == c) && (b == c)) {
                return 0;
            } else if (a == b) {
                sum = c;
                return c;
            } else if (a == c) {
                sum = b;
                return b;
            } else if (b == c) {
                sum = a;
                return a;
            } else {
                sum = a + b + c;
                return sum;
            }
        }

        public static void main(String[] args) {

        }
    }