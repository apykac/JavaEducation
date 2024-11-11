package ru.gazprombank.educate.homework14;

import java.lang.reflect.Array;

public class Homework {

    public static void main(String[] args) {

    }
    public static int partialSum(int a, int b, int c){
        int[] array = {a, b, c};
        int result = 0;
        for(int i : array){
            if(i == 13){
                break;
                }
            else{
                result += i;
            }
        }
        return result;
    }
}
