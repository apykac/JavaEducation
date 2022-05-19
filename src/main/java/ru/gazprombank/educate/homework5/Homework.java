package ru.gazprombank.educate.homework5;

public class Homework {

    public static void main(String[] args) {
        String f = "InsideTheFire";
        System.out.println(middleThree(f));
    }

    public static String middleThree(String f){
        int x = (f.length() / 2);
        if (f.length() <= 3) {
            return f;

        }
        return f.substring(x - 1, x + 2);
    }
}