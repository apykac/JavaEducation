package ru.gazprombank.educate.homework12;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(sumUnique(3, 2, 3));

    }
    public static int sumUnique(int a, int b, int c){
        int summ = 0;
        if (a == b && b== c ){
            summ = 0;
        }else if (a == b ) {
            summ = c;
        } else if (b==c) {
            summ = a;
        } else if (a == c) {
            summ = b;
        } else {
            summ = a + b + c;
        }
        return summ;
    }
}
