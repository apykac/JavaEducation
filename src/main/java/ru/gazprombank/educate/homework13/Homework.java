package ru.gazprombank.educate.homework13;

public class Homework {

    public static void main(String[] args) {

    }
    public static int nearestTwentyOne(int a, int b){
        int result =0;
        if ((a<=21)&&(a>b))
            result = a;
        else if ((b<=21)&&(b>a))
            result = b;
        else if ((a<=21)&&(b>21))
            result = a;
        else if ((b<=21)&&(a>21))
                result = b;
        else if ((b>21)&&(a>21))
            result =0;
        return result;
    }
}
