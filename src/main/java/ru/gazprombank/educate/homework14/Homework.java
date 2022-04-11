package ru.gazprombank.educate.homework14;

public class Homework {

    public static void main(String[] args) {
        System.out.println(partialSum(1, 13, 3));

    }
    public static int partialSum(int a, int b, int c){
        int summ = 0;
        if (a == 13) {
            summ = 0;
        } else if ( b == 13) {
            summ = a;
        } else if ( c == 13) {
            summ = a + b ;
        } else {
            summ = a + b + c ;
        }
        return summ;
    }
}
