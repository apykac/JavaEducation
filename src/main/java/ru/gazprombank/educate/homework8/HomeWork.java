package ru.gazprombank.educate.homework8;

public class HomeWork {

    public static void main(String[] args) {

    }
    public static boolean birdsSinging(int temp, boolean isSummer){
        int min = 60;
        int max = 90;
        if (isSummer){
            max = 100;
        }
        return min<=temp && temp<=max;
    }
}
