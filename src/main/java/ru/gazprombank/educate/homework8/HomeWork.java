package ru.gazprombank.educate.homework8;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(birdsSinging(95, true) );
    }
    public static boolean birdsSinging(int temp, boolean isSummer) {
        boolean result = false ;
        if (isSummer != true) {
            if (temp >= 60 && temp <= 90) {
                result = true;
            }
        } else {
            if (temp > 60 + 10 && temp <= 90 + 10) {
                result = true;
            }
        }
        return result;
    }
}
