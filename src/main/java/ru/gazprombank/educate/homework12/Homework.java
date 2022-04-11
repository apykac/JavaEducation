package ru.gazprombank.educate.homework12;

public class Homework {

    public static void main(String[] args) {

    }
    public static int sumUnique(int a, int b, int c){
        if (a!=b && a!=c && b!=c){
            return a + b + c;
        }
        else if (a == b && a != c){
            return c;
        }
        else if (c == a && b != a){
            return b;
        }
        else if (b == c && a != b){
            return a;
        }
        else {
            return 0;
        }
    }
}
