package ru.gazprombank.educate.homework12;

public class Homework {

    public static void main(String[] args) {
        sumUnique(4, 3, 6);

    }

    public static int sumUnique(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b) {
            sum = c;
        }
        else if (b == c) {
            sum = a;
        }
        else if (a == c) {
            sum = b;
        }
        else if (a == b && b == c && a ==c){
            sum =0;
        }
        else if (a != b && b != c && c != a) {
            sum = a+b+c;
        }
        return sum;
    }
}
