package ru.gazprombank.educate.homework5;

import java.util.Locale;

public class Homework {

    public static void main(String[] args) {
        String str = "Rabbit";
        System.out.println(middleThree(str));

    }
    public static String middleThree(String str){
        int a = (str.length()/2);
        if (str.length()<=3) {
            return str;
        }
        return str.substring(a-1, a+2);
        }
    }

