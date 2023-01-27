package ru.gazprombank.educate.homework13;

public class Homework {

    public static int nearestTwentyOne (int a, int b) {

        return (a>21?(b>21?0:b):(b>21?a:(a-b>=0?a:b)));
    }

    public static void main(String[] args) {

    }
}
