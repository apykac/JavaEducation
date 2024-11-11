package ru.gazprombank.educate.homework12;

public class Homework {

    public static void main(String[] args) {

        sumUnique(2, 3, 3);
    }

    public static int sumUnique(int a, int b, int c){

    if(a == b &&  c == a){
        return 0;
    }
    if(a == b){
        a = b = 0;
    }
    if(a == c){
        a = c = 0;
    }
    if(c == b){
        c = b = 0;
    }

        return a + b + c;
    }
}
