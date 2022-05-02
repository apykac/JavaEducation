package ru.gazprombank.educate.homework12;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(sumUnique(1,2,3));
    }
    public static int sumUnique (int a, int b, int c) {
        int sum = a + b + c;
        if ((a == b) && (a == c))
            sum = 0;
        else {
            if (a == b)
                sum = c;
            if (b == c)
                sum = a;
            if (a == c)
                sum = b;
        }
        return sum;
    }
}
