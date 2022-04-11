package ru.gazprombank.educate.homework14;

public class Homework {

    public static void main(String[] args) {

    }
    public static int partialSum(int a, int b, int c){
        if (a == 13){
            return 0;
        }
        else if (a != 13 && b == 13){
            return a;
        }
        else if (a != 13 && b != 13 && c == 13){
            return a + b;
        }
        else {
            return a + b + c;
        }
    }
}
