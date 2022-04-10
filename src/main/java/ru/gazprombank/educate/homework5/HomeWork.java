package ru.gazprombank.educate.homework5;

public class HomeWork {

    public static void main(String[] args) {

    }
    public static String middleThree(String a){
        if (a.length()<=3) {
            return a;
        }
        else {
            int del = (a.length() - 3) / 2;
            return a.substring(del, a.length()-del);
        }
    }


}
