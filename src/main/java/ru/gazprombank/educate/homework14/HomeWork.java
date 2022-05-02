package ru.gazprombank.educate.homework14;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(partialSum(1,3,13));
    }
    public static int partialSum(int a, int b, int c){
        int sum = a + b + c;
        if (a == 13){
            sum = 0;
        }
        else if (b == 13){
            sum = a;
        }
        else if (c == 13){
            sum = a + b;
        }
        return sum;
    }
}
