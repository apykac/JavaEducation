package ru.gazprombank.educate.homework9;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(isOrdered(1, 2, 1, false));

    }
    public static boolean isOrdered (int first, int second, int third, boolean itsOk){
        boolean result =  false ;
        if (itsOk != true) {
            if (second > first && third > second) {
                result = true;
            }
        } else {
            if (second <= first && third > second) {
                result = true;
            }
        }
        return result;
    }
}
