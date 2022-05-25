package ru.gazprombank.educate.homework8;

public class Homework {

    public static void main(String[] args) {
        System.out.println( birdsSinging(67, true));
    }
    public static boolean birdsSinging( int temp, boolean isSummer){
        if((temp > 60) && ((!isSummer && temp <=90) || (temp <= 100 && isSummer))){
            return true;
        }
        return false;
    }
}
