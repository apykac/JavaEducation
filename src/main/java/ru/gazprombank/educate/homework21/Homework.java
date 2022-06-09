package ru.gazprombank.educate.homework21;

public class Homework {

    public static void main(String[] args) {

    }

    public static String endoo(String str){
        char o = 'o';

        if (str.length() < 1) {
            return "";
        }

        if (str.indexOf(o) == 0 && !str.matches("[o]*")){
            return endoo(str.substring(1) + o);
        } else {
            return str.charAt(0) + endoo(str.substring(1));
        }
    }
}
