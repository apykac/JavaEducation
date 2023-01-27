package ru.gazprombank.educate.homework12;

public class Homework {
    public static int sumUnique(int a, int b, int c) {

    return (a==b ? (b==c ? 0: c): (a==c? b:(b==c? a: a+b+c)));


    };

    public static void main(String[] args) {

    }
}
